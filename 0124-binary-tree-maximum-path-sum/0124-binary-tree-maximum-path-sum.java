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
    int maxsum;
    public int maxPathSum(TreeNode root) {
        maxsum=Integer.MIN_VALUE;
        solve(root);
        return maxsum;
    }
    public int solve(TreeNode root){
        if(root==null)return 0;

        int left=Math.max(0,solve(root.left));
        int right=Math.max(0,solve(root.right));

        int sum=root.val+left+right;
        maxsum =Math.max(maxsum,sum);
        return Math.max(right,left)+root.val;
    }
}