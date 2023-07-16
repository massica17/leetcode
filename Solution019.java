public class Solution019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = head;
        ListNode l = null;
        ListNode pl = null;
        for(int i = 1; i < n; i++){
            r = r.next;
        }
        l = head;
        pl = null;
        while(r.next != null){
            r = r.next;
            pl = l;
            l = l.next;
        }
        if(l == head){
            head = head.next;
        }else{
            pl.next = l.next;
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 