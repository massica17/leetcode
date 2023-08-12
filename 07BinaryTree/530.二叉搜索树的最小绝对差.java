/*
 * @lc app=leetcode.cn id=530 lang=java
 *
 * [530] 二叉搜索树的最小绝对差
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

    public int min = Integer.MAX_VALUE;
    public TreeNode pre = null;
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(pre != null){
            min = Math.min(min, root.val - pre.val);
        }
        pre = root;
        traversal(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        if(root == null){
            return 0;
        }
        traversal(root);
        return min;
    }

    
}
// @lc code=end

