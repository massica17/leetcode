/*
 * @lc app=leetcode.cn id=515 lang=java
 *
 * [515] 在每个树行中找最大值
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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Deque<TreeNode> dq = new LinkedList<>();
        dq.add(root);
        TreeNode temp = root;
        res.add(root.val);
        int max = Integer.MIN_VALUE;
        boolean find = false;
        while(!dq.isEmpty()){
            max = Integer.MIN_VALUE;
            find = false;
            int size = dq.size();
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                if(temp.left != null){
                    if(max < temp.left.val){
                        max = temp.left.val;
                    }
                    dq.add(temp.left);
                    find = true;
                }
                if(temp.right != null){
                    if(max < temp.right.val){
                        max = temp.right.val;
                    }
                    dq.add(temp.right);
                    find = true;
                }
            }
            if(find){
                res.add(max);
            }
        }
        return res;
    }
}
// @lc code=end

