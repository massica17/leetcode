/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */

// @lc code=start

import java.util.Deque;
import java.util.LinkedList;

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
    public int minDepth(TreeNode root) {
        TreeNode temp = root;
        int depth = 0;
        if(root == null){
            return 0;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addFirst(root);
        int size = 0;
        while(dq.isEmpty() == false){
            size = dq.size();
            depth += 1;
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                if(temp.left == null && temp.right == null){
                    return depth;
                }
                if(temp.left != null){
                    dq.addLast(temp.left);
                }
                if(temp.right != null){
                    dq.addLast(temp.right);
                }
            }
        }
        return depth;
    }
}
// @lc code=end

