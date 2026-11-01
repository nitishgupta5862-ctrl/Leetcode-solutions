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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
              temp=temp.next;
              size++;
        }
        int ans[]=new int[size];
        ListNode newnode=reverse(head);
        ListNode temp1=newnode;
        Stack<Integer> st=new Stack<>();
        int i=0;
        while(temp1!=null){
          while(!st.isEmpty()&&st.peek()<=temp1.val){
               st.pop();
          }
          if(st.isEmpty()){
            ans[i]=0;

          }else{
            ans[i]=st.peek();
          }
          i++;
          st.push(temp1.val);
          temp1=temp1.next;
        }
        ArrayList<Integer> result=new ArrayList<>();
        for(int anss:ans){
            result.add(anss);
        }
        Collections.reverse(result);
        int out[]=new int[result.size()];
        for(int j=0;j<result.size();j++){
            out[j]=result.get(j);
        }
        return out;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
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