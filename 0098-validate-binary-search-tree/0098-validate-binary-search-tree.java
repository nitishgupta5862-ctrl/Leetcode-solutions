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
    public boolean isValidBST(TreeNode root) {
    //     return isvalid(root,null,null);
        
    // }
    // public boolean isvalid(TreeNode root,TreeNode min,TreeNode max){
    //     if(root==null){
    //         return true;
    //     }
    //     if(min !=null &&root.val<=min.val){
    //         return false;
    //     }else if(max!=null &&root.val >=max.val){
    //         return false;
    //     }
    //     return isvalid(root.left,min,root)&&isvalid(root.right,root,max);


    TreeNode curr=root;
    long prev=Long.MIN_VALUE;
        while(curr!=null){
            if(curr.left!=null){
                //find predecesor
                TreeNode pred=curr.left;
                while(pred.right!=null &&pred.right!=curr){
                    pred=pred.right;
                }
                    if(pred.right==null){    //link
                       pred.right=curr;
                       curr=curr.left;
                    }else{
                        pred.right=null;
                       if(curr.val<=prev)return false;
                       prev = curr.val;
                        curr=curr.right;
                    }
            }

            else{
                if(curr.val<=prev)return false;
                prev=curr.val;
                curr=curr.right;
            }
        }  
        return true;
    }
}