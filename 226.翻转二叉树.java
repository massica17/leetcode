/*
 * @lc app=leetcode.cn id=226 lang=java
 *
 * [226] 翻转二叉树
 */

// @lc code=start



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
    public void swap(TreeNode node){
        if(node == null){
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        swap(node.left);
        swap(node.right);
    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}
// @lc code=end

