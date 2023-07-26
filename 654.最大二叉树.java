/*
 * @lc app=leetcode.cn id=654 lang=java
 *
 * [654] 最大二叉树
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
    public int getInd(int[] nums, int left, int right){
        int max = Integer.MIN_VALUE;
        int max_ind = left;
        for(int i = left; i <= right; i++){
            if(max < nums[i]){
                max = nums[i];
                max_ind = i;
            }
        }
        return max_ind;
    }
    public TreeNode build(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        int max_ind = getInd(nums, left, right);
        TreeNode node = new TreeNode(nums[max_ind]);
        if(max_ind > left){
            node.left = build(nums, left, max_ind - 1);
        }
        if(max_ind < right){
            node.right = build(nums, max_ind + 1, right);
        }
        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        TreeNode root = build(nums, 0, nums.length - 1);
        return root;
    }
}
// @lc code=end

