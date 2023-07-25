/*
 * @lc app=leetcode.cn id=222 lang=java
 *
 * [222] 完全二叉树的节点个数
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
    public int countNodes(TreeNode root) {
        Deque<TreeNode> dq = new LinkedList<>();
        int size = 0;
        int count = 0;
        int add = 0;
        if(root == null){
            return 0;
        }
        int lt = 1;
        int rt = 1;
        TreeNode temp = root;
        while(temp.left != null){
            lt++;
            temp = temp.left;
        }
        temp = root;
        while(temp.right != null){
            rt++;
            temp = temp.right;
        }
        if(lt == rt){
            return (int)Math.pow(2, lt) - 1;
        }

        dq.addFirst(root);
        out:
        while(!dq.isEmpty()){
            size = dq.size();
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                count++;
                if(temp.left != null){
                    dq.addLast(temp.left);
                }
                else {
                    add = 1;
                    break out;
                }
                if(temp.right != null){
                    dq.addLast(temp.right);
                }
                else {
                    add = 0;
                    break out;
                }
            }
        }
        return 2 * count - add;
    }
}
// @lc code=end

