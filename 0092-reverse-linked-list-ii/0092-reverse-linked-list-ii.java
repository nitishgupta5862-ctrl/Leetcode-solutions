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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // if(head==null){
        //     return null;
        // }
        // ArrayList<ListNode> arr=new ArrayList<>();
        // ListNode temp=head;
        // while(temp!=null){
        //     arr.add(temp);
        //     temp=temp.next;
        // }
        // int i=left-1;
        // int j=right-1;
        // while(i<j){
        //     ListNode t1=arr.get(i);
        //     ListNode t2=arr.get(j);
        //     arr.set(i,t2);
        //     arr.set(j,t1);
        //     i++;
        //     j--;
        // }
        // for( i=0;i<arr.size()-1;i++){
        //     if(i==arr.size()-1)arr.get(i).next=null;
        //     arr.get(i).next=arr.get(i+1);
        // }
        //   arr.get(arr.size() - 1).next = null;

        // return arr.get(0);
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        dummy.next=head;
        for(int i=1;i<=left-1;i++){
            temp=temp.next;
        }
        ListNode tail1=temp;
        ListNode head2=temp.next;
         
        for(int i=1;i<=right-left+1;i++){
            temp=temp.next;
        }
        ListNode tail2=temp;
        ListNode head3=temp.next;
         tail1.next=null;
        tail2.next=null;
        reverse(head2);
        tail1.next=tail2;
        head2.next=head3;
        return dummy.next;

    }
    public void reverse(ListNode head2){
        ListNode prev=null;
        ListNode curr=head2;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
}