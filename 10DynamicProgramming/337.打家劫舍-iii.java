/*
 * @lc app=leetcode.cn id=337 lang=java
 *
 * [337] 打家劫舍 III
 */

// @lc code=start

import java.util.HashMap;

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
    public int rob(TreeNode root) {
        HashMap<TreeNode, Integer> map = new HashMap<>();
        return robAction(root, map);
    }

    public int robAction(TreeNode root, HashMap<TreeNode, Integer> map){
        if(root == null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int money = root.val;
        if(root.left != null) money += robAction(root.left.left, map) +  robAction(root.left.right, map);
        if(root.right != null) money += robAction(root.right.left, map) + robAction(root.right.right, map);
        int res = Math.max(money, robAction(root.left, map) + robAction(root.right, map));
        map.put(root, res);
        return res;
    }

}
// @lc code=end

