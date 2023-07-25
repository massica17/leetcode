/*
 * @lc app=leetcode.cn id=572 lang=java
 *
 * [572] 另一棵树的子树
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
    public boolean preorder(TreeNode node, TreeNode subRoot){
        if(node == null){
            return false;
        }
        boolean same = false;
        if(node.val == subRoot.val){
           same = treeCompare(node, subRoot);
        }
        return same || preorder(node.left, subRoot) || preorder(node.right, subRoot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return preorder(root, subRoot);
    }
}
// @lc code=end

