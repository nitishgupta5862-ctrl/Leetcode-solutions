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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> values=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            values.add(temp.val);
            temp=temp.next;
        }
        return createBst(values,0,values.size()-1);
        
    }
    public TreeNode createBst(ArrayList<Integer> values,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        TreeNode root=new TreeNode(values.get(mid));
        root.left=createBst(values,st,mid-1);
        root.right=createBst(values,mid+1,end);
        return root;
    }
}