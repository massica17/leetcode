/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean treeCompare(TreeNode lnode, TreeNode rnode){
        if(lnode != null && rnode != null){
            if(lnode.val != rnode.val){
                return false;
            }

            TreeNode ll = lnode.left;
            TreeNode lr = lnode.right;
            TreeNode rl = rnode.left;
            TreeNode rr = rnode.right;

            return treeCompare(ll, rr) && treeCompare(lr, rl);
        }
        else if(lnode == null && rnode == null){
            return true;
        }
        else return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return treeCompare(root.left, root.right);
    }
}
// @lc code=end

