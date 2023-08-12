/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
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
        return res;
    }
}
// @lc code=end

