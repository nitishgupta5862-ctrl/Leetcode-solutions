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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isidentical(root,subRoot)){
                return true;
            }
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
    public boolean isidentical(TreeNode node,TreeNode subRoot){
        if(node==null && subRoot==null){
            return true;
        }else if(node==null ||subRoot==null||node.val!=subRoot.val){
            return false;
        }
        if(!isidentical(node.left,subRoot.left)){
            return false;
        }
        if(!isidentical(node.right,subRoot.right)){
            return false;
        }
        return true;
    }
}