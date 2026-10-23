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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        Queue<Integer> row=new LinkedList<>();
        Queue<Integer> col=new LinkedList<>();
        q.add(root);
        row.add(0);
        col.add(0);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            int rows=row.remove();
            int cols=col.remove();
            if(!map.containsKey(cols)){
                map.put(cols,new TreeMap<>());
            }
            if(!map.get(cols).containsKey(rows)){
                map.get(cols).put(rows,new PriorityQueue<>());
            }
            map.get(cols).get(rows).add(curr.val);
            if(curr.left!=null){
                q.add(curr.left);
                row.add(rows+1);
                col.add(cols-1);
            }
            if(curr.right!=null){
                q.add(curr.right);
                row.add(rows+1);
                col.add(cols+1);
            }

        }
        for(TreeMap<Integer,PriorityQueue<Integer>> rowmap:map.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer>pq:rowmap.values()){
                while(!pq.isEmpty()){
                    list.add(pq.remove());
                }
            }ans.add(list);
        }
        return ans;
    }
}