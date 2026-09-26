class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int result[]=new int[n*n];
        int m=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                result[m]=matrix[i][j];
                m++;
            }
        }
        Arrays.sort(result);
        return result[k-1];
        
    }
}