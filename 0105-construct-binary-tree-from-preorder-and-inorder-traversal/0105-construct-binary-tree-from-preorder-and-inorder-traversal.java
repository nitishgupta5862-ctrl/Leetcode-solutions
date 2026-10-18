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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n=preorder.length;
        return construct(0,n-1,0,n-1,preorder,inorder);
    }
    public TreeNode construct(int plow,int phig,int inlow,int inhig,int[] preorder, int[] inorder){
        if(plow>phig)return null;
        int val=preorder[plow];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inlow;i<=inhig;i++){
            if(inorder[i]==val){
              r=i;
              break;
            }
        }
        int cnt=r-inlow;//num of nodes in lst
        root.left=construct(plow+1,plow+cnt,inlow,r-1,preorder,inorder);
         root.right=construct(plow+cnt+1,phig,r+1,inhig,preorder,inorder);
         return root;
    }
}