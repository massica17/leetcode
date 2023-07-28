/*
 * @lc app=leetcode.cn id=236 lang=java
 *
 * [236] 二叉树的最近公共祖先
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

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
    private TreeNode fp = null;
    private TreeNode fq = null;
    private void find(TreeNode fnode, TreeNode node){
        if(node == null) return;
        if(node.left != null) find(node, node.left);
        if(node.right != null) find(node, node.right);
        if(fp == fq) return;
        if(node.val == fp.val) fp = fnode;
        if(node.val == fq.val) fq = fnode;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        fp = p;
        fq = q;
        if(p.val == root.val || q.val == root.val) return root;
        find(root, root.left);
        find(root, root.right);
        return fp;
    }
}
// @lc code=end

