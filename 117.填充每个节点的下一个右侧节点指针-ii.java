/*
 * @lc app=leetcode.cn id=117 lang=java
 *
 * [117] 填充每个节点的下一个右侧节点指针 II
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root == null){
            return root;
        }
        Deque<Node> dq = new LinkedList<>();
        dq.addFirst(root);
        int size = 0;
        Node slow = root;
        Node fast = root;
        while(dq.isEmpty() == false){
            size = dq.size();
            fast = dq.pollFirst();
            if(fast.left != null){
                dq.addLast(fast.left);
            }
            if(fast.right != null){
                dq.addLast(fast.right);
            }
            for(int i = 0; i < size - 1; i++){
                slow = fast;
                fast = dq.pollFirst();
                slow.next = fast;
                if(fast.left != null){
                    dq.addLast(fast.left);
                }
                if(fast.right != null){
                    dq.addLast(fast.right);
                }
            }
        }
        return root;
    }
}
// @lc code=end

