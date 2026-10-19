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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root,inorder);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<inorder.size();i++){
           int diff=inorder.get(i)-inorder.get(i-1);
           min=Math.min(min,diff);
        }
        return min;
    }
    public void getinorder(TreeNode root,ArrayList<Integer> inorder){
        if(root==null)return;
        getinorder(root.left,inorder);
        inorder.add(root.val);
        getinorder(root.right,inorder);
    }
}