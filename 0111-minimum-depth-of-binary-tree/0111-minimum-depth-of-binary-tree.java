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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null){     //kewal right node hai to
            return 1+minDepth(root.right);
        }
        if(root.right==null){    //kewal left node hai to
            return 1+minDepth(root.left);
        }

        int lh=minDepth(root.left);
        int rh=minDepth(root.right);
        return Math.min(lh,rh)+1;
        
    }
}