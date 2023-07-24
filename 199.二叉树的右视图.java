/*
 * @lc app=leetcode.cn id=199 lang=java
 *
 * [199] 二叉树的右视图
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
    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dq.addFirst(root);
        int size = 0;
        TreeNode temp = root;
        TreeNode rightNode = temp;
        while(dq.isEmpty() == false){
            res.add(rightNode.val);
            size = dq.size();
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                if(temp.left != null){
                    rightNode = temp.left;
                    dq.addLast(temp.left);
                }
                if(temp.right != null){
                    rightNode = temp.right;
                    dq.addLast(temp.right);
                }
            }
        }
        return res;
    }
}
// @lc code=end

