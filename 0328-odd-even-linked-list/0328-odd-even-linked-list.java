/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // int i=1;
        // ListNode d1=new ListNode(-1);
        // ListNode d2=new ListNode(-1);
        // ListNode t1=d1;
        // ListNode t2=d2;
        // ListNode t=head;
        // while(t!=null){
        //     if(i%2 !=0){
        //         t1.next=t;
        //         t1=t1.next;
        //         t=t.next;
        //     }
        //     else{
        //         t2.next=t;
        //         t2=t2.next;
        //         t=t.next;
        //     }
        //     i++;
        // }
        // t1.next=d2.next;
        // t2.next=null;
        // return d1.next;

       if (head == null || head.next == null) {
        return head;
    }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenhead=even;
        while(even !=null &&even.next!=null){
            odd.next=even.next;
            odd=odd.next;

            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }
}




















