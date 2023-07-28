/*
 * @lc app=leetcode.cn id=538 lang=java
 *
 * [538] 把二叉搜索树转换为累加树
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
    private int sum = 0;
    public void getSumTree(TreeNode root){
        if(root == null) return;
        getSumTree(root.right);
        sum += root.val;
        root.val = sum;
        getSumTree(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        getSumTree(root);
        return root;
    }
}
// @lc code=end

