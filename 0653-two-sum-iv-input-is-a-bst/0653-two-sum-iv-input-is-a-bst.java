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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> inorder=new ArrayList<>();
        getinorder(root,inorder);
        for(int i=0;i<inorder.size()-1;i++){
            int sum=0;
            for(int j=i+1;j<inorder.size();j++){
                sum =inorder.get(i)+inorder.get(j);
                if(sum==k){
                    return true;
                }
            }
        }
        return false;
    }
    public void getinorder(TreeNode root, ArrayList<Integer> inorder){
        if(root==null)return;
        getinorder(root.left,inorder);
        inorder.add(root.val);
        getinorder(root.right,inorder);
    }
}