/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int dfs(TreeNode node, int res){
        if(node == null){
            return res;
        }
        return Math.max(dfs(node.left, res + 1), dfs(node.right, res + 1));
    }
    public int maxDepth(TreeNode root) {
        int res = 0;
        if(root == null){
            return 0;
        }        
        return dfs(root, res);
    }
}
// @lc code=end

