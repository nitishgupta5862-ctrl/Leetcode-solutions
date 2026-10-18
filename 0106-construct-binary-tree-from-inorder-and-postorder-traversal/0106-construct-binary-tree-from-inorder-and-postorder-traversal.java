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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         int n=postorder.length;
        return construct(0,n-1,0,n-1,postorder,inorder);
    }
    public TreeNode construct(int plow,int phig,int inlow,int inhig,int[] postorder, int[] inorder){
        if(plow>phig)return null;
        int val=postorder[phig];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inlow;i<=inhig;i++){
            if(inorder[i]==val){
              r=i;
              break;
            }
        }
        int cnt=r-inlow;//num of nodes in lst
        
         root.right=construct(plow+cnt,phig-1,r+1,inhig,postorder,inorder);
         root.left=construct(plow,plow+cnt-1,inlow,r-1,postorder,inorder);
         return root;
    }
}