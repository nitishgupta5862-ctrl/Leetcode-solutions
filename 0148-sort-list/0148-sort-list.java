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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
    return head;
}
        ListNode mid=findmid(head);
        ListNode righthead=mid.next;
        mid.next=null;
        ListNode right=sortList(righthead);
        ListNode left=sortList(head);
        return merge(right,left);
        
    }
    public ListNode findmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode right,ListNode left){
        ListNode mergell=new ListNode(-1);
        ListNode temp=mergell;
        while(left!=null &&right !=null){
            if(left.val<=right.val){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }else{
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        }
        while(left!=null){
            temp.next=left;
             left=left.next;
            temp=temp.next;

        }
        while(right!=null){
             temp.next=right;
             right=right.next;
            temp=temp.next;


        }
        return mergell.next;
    }
}