/*
 * @lc app=leetcode.cn id=429 lang=java
 *
 * [429] N 叉树的层序遍历
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
/* 
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }
        Deque<Node> dq = new LinkedList<>();
        dq.addFirst(root);
        Node temp = root;
        List<Integer> res_root = new ArrayList<>();
        res_root.add(root.val);
        res.add(res_root);
        int size = 0;
        while(!dq.isEmpty()){
            List<Integer> res_u = new ArrayList<>();
            size = dq.size();
            for(int i = 0; i < size; i++){
                temp = dq.pollFirst();
                for(int j = 0; j <temp.children.size(); j++){
                    dq.addLast(temp.children.get(j));
                    res_u.add(temp.children.get(j).val);
                }
            }
            if(res_u.size() != 0){
                res.add(res_u);
            }
        }
        return res;
    }
}
// @lc code=end

