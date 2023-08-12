/*
 * @lc app=leetcode.cn id=513 lang=java
 *
 * [513] 找树左下角的值
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
    public int findBottomLeftValue(TreeNode root) {
        TreeNode temp  = root;
        Deque<TreeNode> dq = new LinkedList<>();
        dq.addLast(root);
        int size = 0;
        TreeNode res = root;
        while(!dq.isEmpty()){
            size = dq.size();
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                if(i == 0){
                    res = temp;
                }
                if(temp.left != null){
                    dq.addLast(temp.left);
                }
                if(temp.right != null){
                    dq.addLast(temp.right);
                }
            }
        }
        return res.val;
    }
}
// @lc code=end

