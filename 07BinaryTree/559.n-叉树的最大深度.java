/*
 * @lc app=leetcode.cn id=559 lang=java
 *
 * [559] N 叉树的最大深度
 */

// @lc code=start

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
    public int getDepth(Node node, int depth){
        if(node.children.size() == 0){
            return depth;
        }
        int max = 0;
        int temp = 0;
        for(int i = 0; i < node.children.size(); i++){
            temp = getDepth(node.children.get(i), depth + 1);
            if(temp >= max){
                max = temp;
            }
        }
        return max;
    }
    public int maxDepth(Node root) {
        if(root == null){
            return 0;
        }
        return getDepth(root, 1);    
    }
}
// @lc code=end

