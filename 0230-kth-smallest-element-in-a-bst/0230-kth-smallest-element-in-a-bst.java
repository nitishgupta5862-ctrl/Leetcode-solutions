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
    int ans=-1;
     int count=0;
    public int kthSmallest(TreeNode root, int k) {
    //     ArrayList<Integer> inorder=new ArrayList<>();        //method 1
                                                                //s.c =o(n)
    //     getinorder(root,inorder);
    //     return inorder.get(k-1);
        
    // }
    // public void getinorder(TreeNode root, ArrayList<Integer> inorder){
    //     if(root==null)return;
    //     getinorder(root.left,inorder);
    //     inorder.add(root.val);
    //     getinorder(root.right,inorder);

     helper(root,k);                                         //s.c =o(1)
     return ans;
    }
    public void helper(TreeNode root,int k){
        if(root==null)return;
        helper(root.left,k);
        count +=1;
        if(count==k){
            ans= root.val;
            return ;
        }
        helper(root.right,k);
    }
}