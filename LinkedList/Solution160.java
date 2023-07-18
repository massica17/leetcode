package LinkedList;

public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = 0;
        int lb = 0;
        ListNode ta = headA;
        ListNode tb = headB;
        while(ta != null){
            la ++;
            ta = ta.next;
        }
        while(tb != null){
            lb ++;
            tb = tb.next;
        }

        int count = 0;
        ta = headA;
        tb = headB;
        if(la > lb){ 
            while(count < la - lb){
                ta = ta.next;
                count++;
            }
        }else {
            while(count < lb - la){
                tb = tb.next;
                count++;
            }
        }
        while(ta != tb){
            ta = ta.next;
            tb = tb.next;
        }
        return ta;
    }
}
