/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层序遍历 II
 */

// @lc code=start

import java.util.ArrayList;
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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return res;
        }
        q.add(root);
        TreeNode temNode = root;
        int size = 0;
        while(!q.isEmpty()){
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
            res.add(res_u);
        }
        int slow = 0, fast = res.size() - 1;
        List<List<Integer>> res_re = new ArrayList<List<Integer>>();
        for(int i = 0; i < res.size(); i++){
            res_re.add(res.get(res.size() - i -1));
        }
        return res_re;
    }
}
// @lc code=end

