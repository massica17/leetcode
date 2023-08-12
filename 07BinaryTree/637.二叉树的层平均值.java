/*
 * @lc app=leetcode.cn id=637 lang=java
 *
 * [637] 二叉树的层平均值
 */

// @lc code=start

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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        TreeNode temNode = root;
        int size = 0;
        while(!q.isEmpty()){
            Double res_d = 0.0;
            List<Integer> res_u = new ArrayList<>();
            size = q.size();
            for(int i = 0; i < size; i++){
                temNode = q.poll();
                res_u.add(temNode.val);
                if(temNode.left != null){
                    q.add(temNode.left);
                }
                if(temNode.right!=null){
                    q.add(temNode.right);
                }
            }
            for(int i = 0; i < res_u.size(); i++){
                res_d += Double.valueOf(res_u.get(i));
            }
            res_d /= Double.valueOf(res_u.size());
            res.add(res_d);
        }
        return res;
    }
}
// @lc code=end

