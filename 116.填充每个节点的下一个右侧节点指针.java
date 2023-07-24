/*
 * @lc app=leetcode.cn id=116 lang=java
 *
 * [116] 填充每个节点的下一个右侧节点指针
 */

// @lc code=start

import java.util.Deque;
import java.util.LinkedList;


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
                slow.right = fast;
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

