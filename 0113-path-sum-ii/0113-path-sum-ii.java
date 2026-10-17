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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer> res=new ArrayList<>();
         functions(root,targetSum,0,ans,res);
         return ans;
         
    }
    public void functions(TreeNode root,int targetsum,long sum, List<List<Integer>> ans,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        sum +=root.val;
        if(root.left==null &&root.right==null){
            if(sum==targetsum){
                ans.add(new ArrayList<>(res));
            }
        }
        functions(root.left,targetsum,sum,ans,res);
        functions(root.right,targetsum,sum,ans,res);
        res.remove(res.size()-1);
    }
}