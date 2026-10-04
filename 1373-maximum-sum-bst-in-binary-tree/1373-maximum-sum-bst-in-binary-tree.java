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
    class info{
        boolean isbst;
        int sum;
        int min;
        int max;
        info(boolean isbst,int sum,int min,int max){
            this.isbst=isbst;
            this.sum=sum;
            this.min=min;
            this.max=max;
        }
    }
    static int maxsum=0;
    public int maxSumBST(TreeNode root) {
    maxsum = 0;
    helper(root);
    return maxsum;
    }
    public info helper(TreeNode root){
        if(root==null){
            return new info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
        info leftinfo=helper(root.left);
        info rightinfo=helper(root.right);

        int sum =leftinfo.sum+rightinfo.sum +root.val;
        int min=Math.min(root.val,Math.min(leftinfo.min,rightinfo.min));
         int max=Math.max(root.val,Math.max(leftinfo.max,rightinfo.max));

         if(root.val<=leftinfo.max ||root.val>=rightinfo.min){
            return new info(false,sum,min,max);
         }
         if(leftinfo.isbst &rightinfo.isbst){
            maxsum=Math.max(maxsum,sum);
            return new info(true,sum,min,max);
         }
         return new info(false,sum,min,max);
        
    }
}