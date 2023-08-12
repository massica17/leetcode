/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
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
    public void getPath(TreeNode node, String path, List<String> res){
        //System.out.println(path);
        if(node.left == null && node.right == null){
            res.add(path);
            return;
        }
        if(node.left != null){
            getPath(node.left, path + "->" + node.left.val, res);
        }
        if(node.right != null){
            getPath(node.right, path + "->" + node.right.val, res);
        }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        getPath(root, "" + root.val, res);
        return res;
    }
}
// @lc code=end

