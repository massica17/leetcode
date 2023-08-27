/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
 */

// @lc code=start

import java.util.List;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode head = null;
        ListNode temp = head;
        while(true){
            boolean has_next = false;
            int min = Integer.MAX_VALUE;
            int min_ind = 0;
            for(int i = 0; i < n; i++){
                if(lists[i] != null){
                    has_next = true;
                    if(lists[i].val < min){
                        min = lists[i].val;
                        min_ind = i;
                    }
                }
            }
            if(!has_next) return head;
            else{
                if(head == null){
                    head = new ListNode(lists[min_ind].val);
                    temp = head;
                }
                else{
                    temp.next = new ListNode(lists[min_ind].val);
                    temp = temp.next;
                }
                lists[min_ind] = lists[min_ind].next;
            }
        }
    }
}
// @lc code=end

