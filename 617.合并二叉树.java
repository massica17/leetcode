/*
 * @lc app=leetcode.cn id=617 lang=java
 *
 * [617] 合并二叉树
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
    public void merge(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return;
        }
        if(node1 != null && node2 == null){
            return;
        }
        if(node1 == null && node2 != null){
            node1 = new TreeNode(node2.val);
            return;
        }
        if(node1 != null && node2 != null){
            node1.val = node1.val + node2.val;
            merge(node1.left, node2.left);
            merge(node1.right, node2.right);
        }
    }
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        merge(root1, root2);
        return root1;
    }
}
// @lc code=end

