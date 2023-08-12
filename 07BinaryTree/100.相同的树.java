/*
 * @lc app=leetcode.cn id=100 lang=java
 *
 * [100] 相同的树
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
    boolean treeCompare(TreeNode p, TreeNode q){
        if(p != null && q != null){
            if(p.val != q.val){
                return false;
            }
            return treeCompare(p.left, q.left) && treeCompare(p.right, q.right);
        }
        else if(p == null && q == null){
            return true;
        }
        else return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return treeCompare(p, q);
    }
}
// @lc code=end

