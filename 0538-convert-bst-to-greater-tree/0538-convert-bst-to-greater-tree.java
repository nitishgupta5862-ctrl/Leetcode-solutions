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
    public void revinorder(TreeNode root,ArrayList<TreeNode> inorder){
        if(root==null)return;
        revinorder(root.right,inorder);
        inorder.add(root);
        revinorder(root.left,inorder);
    }
    public TreeNode convertBST(TreeNode root) {
        int sum=0;
        ArrayList<TreeNode> inorder=new ArrayList<>();
        revinorder(root,inorder);
        for(int i=0;i<inorder.size();i++){
            sum +=inorder.get(i).val;
            inorder.get(i).val=sum;
            
        }
        return root;
    }
}