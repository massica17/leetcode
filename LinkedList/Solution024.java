package LinkedList;

public class Solution024 {
    public ListNode swapPairs(ListNode head) {
        ListNode r = head;
        ListNode l = null;
        
        if(r == null || r.next == null){
            return head;
        }
        r = head.next;
        l = head;
        
        if(r.next == null){
            r.next = l;
            l.next = null;
            head = r;
            return head;
        }

        ListNode pre_l = null;
        ListNode aft_r = r.next;

        if(l == head){
            aft_r = r.next;
            l.next = aft_r;
            r.next = l;
            head = r;

            l = head;
            r = head.next;
            aft_r = r.next;
            pre_l = null;
        }
        while(true){
            if(r.next != null){
                pre_l = l;
                l = l.next;
                r = r.next;
                aft_r = r.next;
                if(r.next != null){
                    pre_l = l;
                    l = l.next;
                    r = r.next;
                    aft_r = r.next;

                    pre_l.next = r;
                    l.next = aft_r;
                    r.next = l;
                    l = pre_l.next;
                    r = pre_l.next.next;
                }
                else{
                    return head;
                }
            }
            else{
                return head;
            }
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


