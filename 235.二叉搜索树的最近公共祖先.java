/*
 * @lc app=leetcode.cn id=235 lang=java
 *
 * [235] 二叉搜索树的最近公共祖先
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    private TreeNode preTraversal(TreeNode node, TreeNode p, TreeNode q){
        if(node == null) return null;
        if(node.val <= q.val && node.val >= p.val) return node;
        TreeNode res = preTraversal(node.left, p, q);
        return res != null ? res : preTraversal(node.right, p, q);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val < q.val) return preTraversal(root, p, q);
        else return preTraversal(root, q, p);
    }
}
// @lc code=end

