/*
 * @lc app=leetcode.cn id=105 lang=java
 *
 * [105] 从前序与中序遍历序列构造二叉树
 */

// @lc code=start

import java.util.Map;

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
    public TreeNode build(int[] inorder, int inl, int inr, int[] preorder, int prel, int prer){
        if(inl > inr || prel > prer){
            return null;
        }
        int now_ind = m.get(preorder[prel]);
        int left_n = now_ind - inl;
        TreeNode node = new TreeNode(inorder[now_ind]);
        if(now_ind > inl){
            node.left = build(inorder, inl, now_ind - 1, preorder, prel + 1, prel + left_n);
        }
        if(now_ind < inr){
            node.right = build(inorder, now_ind + 1, inr, preorder, prel + left_n + 1, prer);
        }
        return node;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int ls = preorder.length;
        for(int i = 0; i < ls; i++){
            m.put(inorder[i], i);
        }
        TreeNode root = build(inorder, 0, ls - 1, preorder, 0, ls - 1);
        return root;
    }
}
// @lc code=end

