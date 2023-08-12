/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    List <Integer> nums = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        nums.add(root.val);
        inorder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        if(nums.size() == 1){
            return true;
        }
        for(int i = 0; i < nums.size() - 1; i++){
            if(nums.get(i) >= nums.get(i + 1)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

