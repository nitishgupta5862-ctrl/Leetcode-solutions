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
        int dia;
        int ht;
        public info (int dia,int ht){
            this.dia=dia;
            this.ht=ht;
        }


    }
    //public int height(TreeNode root){
    //     if(root==null){      //o(n*2)
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     return Math.max(lh,rh)+1;
    // }
    public info diameter(TreeNode root) {
    //     if(root==null){
    //         return 0;
    //     }
    //     int lh=height(root.left);
    //     int rh=height(root.right);
    //     int ld=diameterOfBinaryTree(root.left);
    //     int rd=diameterOfBinaryTree(root.right);
    //     int selfdia=lh+rh;
    //     return Math.max(selfdia,Math.max(ld,rd));
    if(root==null){
        return new info(0,0);
    }
    info infoleft=diameter(root.left);
    info inforight=diameter(root.right);
    int dia=Math.max(Math.max(infoleft.dia,inforight.dia),infoleft.ht+inforight.ht);
    int ht=Math.max(infoleft.ht,inforight.ht)+1;
    return new info(dia,ht);

        
    }
    public int diameterOfBinaryTree(TreeNode root){
        return diameter(root).dia;
    }
}