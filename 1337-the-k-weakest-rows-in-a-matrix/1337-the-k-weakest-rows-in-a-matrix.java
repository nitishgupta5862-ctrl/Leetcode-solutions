class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }else{
                return a[1]-b[1];
            }
        });
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
                count +=mat[i][j]==1?1:0;
            }
        
        pq.add(new int[]{i,count});
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
           ans[i]=pq.remove()[0];
        }
        return ans;
    }
}