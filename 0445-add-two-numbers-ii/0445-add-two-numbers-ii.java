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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode head1=reverse(l1);
        ListNode temp1=head1;
        ListNode head2=reverse(l2);
        ListNode temp2=head2;
        int curr=0;
        while(temp1!=null||temp2!=null){
            int sum=curr;
            if(temp1!=null){
                sum +=temp1.val;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum +=temp2.val;
                temp2=temp2.next;
            }
            temp.next=new ListNode(sum%10);
            temp=temp.next;
            curr=sum/10;
        }
        if(curr>0){
            temp.next=new ListNode(curr);
        }
        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}