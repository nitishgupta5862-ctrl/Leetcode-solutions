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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root,inorder);
        return inorder.get(k-1);
        
    }
    public void getinorder(TreeNode root, ArrayList<Integer> inorder){
        if(root==null)return;
        getinorder(root.left,inorder);
        inorder.add(root.val);
        getinorder(root.right,inorder);
    }
}