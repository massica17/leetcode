/*
 * @lc app=leetcode.cn id=106 lang=java
 *
 * [106] 从中序与后序遍历序列构造二叉树
 */

// @lc code=start
import java.util.*;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    Map<Integer, Integer> m = new HashMap<>();
    public TreeNode build(int[] inorder, int inl, int inr, int[] postorder, int postl ,int postr){
        if(inr < inl || postr < postl){
            return null;
        }
        int now_ind = m.get(postorder[postr]);
        int left_n = now_ind - inl;
        TreeNode root = new TreeNode(inorder[now_ind]);
        int post_ind = 0;
        if(now_ind > inl){
            root.left = build(inorder, inl, now_ind - 1, postorder, postl, postl + left_n - 1);
        }
        if(now_ind < inr){
            root.right = build(inorder, now_ind + 1, inr, postorder, postl + left_n, postr - 1);
        }
        return root;
    } 
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int ls = inorder.length;
        for(int i = 0; i < ls; i++){
            m.put(inorder[i], i);
        }
        TreeNode root = build(inorder, 0, ls - 1, postorder, 0, ls - 1);
        return root;
    }
}
// @lc code=end
