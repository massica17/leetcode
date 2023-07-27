/*
 * @lc app=leetcode.cn id=501 lang=java
 *
 * [501] 二叉搜索树中的众数
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
class Solution1 {
    Map<Integer, Integer> m = new HashMap<>();
    public void traversal(TreeNode node){
        if(node == null){
            return;
        }
        traversal(node.left);
        m.put(node.val, m.getOrDefault(node.val, 0) + 1);
        traversal(node.right);
    }
    public int[] findMode(TreeNode root) {
        traversal(root);
        int len = 0;
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry: m.entrySet()){
            if(entry.getValue() >= len){
                len = entry.getValue();
            }
        }
        for(Map.Entry<Integer, Integer> entry: m.entrySet()){
            if(entry.getValue() == len){
                res.add(entry.getKey());
            }
        }
        return res.stream().mapToInt(x -> x).toArray();
    }
}

class Solution{
    private TreeNode pre = null;
    private int maxLen = 0;
    private List<Integer> res = new ArrayList<>();
    private void traversal(TreeNode node, int len){
        if(node == null){
            return;
        }
        if(pre != null && pre.val == node.val){
            len += 1;
        }
        pre = node;
        traversal(node.right);
    }
    public int[] findMode(TreeNode root){
        traversal(root, 1);
    }
}

// @lc code=end

