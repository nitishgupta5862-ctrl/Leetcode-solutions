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
    int sum=0;
    //public void revinorder(TreeNode root,ArrayList<TreeNode> inorder){
    //     if(root==null)return;
    //     revinorder(root.right,inorder);             //method1 
    //     inorder.add(root);                          //s.c o(n)
    //     revinorder(root.left,inorder);
    // }
     public TreeNode convertBST(TreeNode root) {
    //     int sum=0;
    //     ArrayList<TreeNode> inorder=new ArrayList<>();
    //     revinorder(root,inorder);
    //     for(int i=0;i<inorder.size();i++){
    //         sum +=inorder.get(i).val;
    //         inorder.get(i).val=sum;
            
    //     }
    //     return root;
       if(root==null){
        return null;
       }
        
        convertBST(root.right);
        sum +=root.val;
        root.val=sum;
        convertBST(root.left);
        return root;
         
    }
}