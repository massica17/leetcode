/*
 * @lc app=leetcode.cn id=701 lang=java
 *
 * [701] 二叉搜索树中的插入操作
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
    public void insert(TreeNode root, int val){
        if(val > root.val){
            if(root.right == null){
                root.right = new TreeNode(val);
                return;
            }
            else insert(root.right, val);
        }
        else{
            if(root.left == null){
                root.left = new TreeNode(val);
                return;
            }
            else insert(root.left, val);
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) root = new TreeNode(val);
        else insert(root, val);
        return root;
    }

}
// @lc code=end

