/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // public boolean getpath(TreeNode root,TreeNode n,ArrayList<TreeNode>path){
    //     if(root==null){
    //         return false;
    //     }
    //     path.add(root);
    //     if(root.val==n.val){
    //         return true;
    //     }
    //    boolean leftfound= getpath(root.left,n,path);
    //    boolean rightfound=getpath(root.right,n,path);
    //    if(leftfound ||rightfound){
    //     return true;
    //    }
    //    path.remove(path.size()-1);
    //    return false;

    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // ArrayList<TreeNode> path1=new ArrayList<>();
        // ArrayList<TreeNode> path2=new ArrayList<>();
        // getpath(root,p,path1);
        // getpath(root,q,path2);
        // int i=0;
        // for(;i<path1.size()&&i<path2.size();i++){
        //     if(path1.get(i)!=path2.get(i)){
        //         break;
        //     }
        // }
        // TreeNode lca=path1.get(i-1);
        // return lca;
        
      if(root==null||root.val==p.val||root.val==q.val){
        return root;
      }
      TreeNode leftlca=lowestCommonAncestor(root.left,p,q);
      TreeNode rightlca=lowestCommonAncestor(root.right,p,q);

      //ek valid ek null ho tb
      if(leftlca==null){
        return rightlca;
      }
      if(rightlca==null){
        return leftlca;
      }
        return root;
    }
}