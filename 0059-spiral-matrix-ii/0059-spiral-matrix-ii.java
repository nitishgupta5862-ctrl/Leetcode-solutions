class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][]=new int[n][n];
        int sr=0;
        int sc=0;
        int ec=n-1;
        int er=n-1;
        int k=1;
        while(sr<=er &&sc<=ec){
            for(int j=sc;j<=ec;j++){
                matrix[sr][j]=k;
                k++;
            }
            sr++;
          for(int i=sr;i<=er;i++){
            matrix[i][ec]=k;
             k++;
          }
          ec--;
          for(int j=ec;j>=sc;j--){
            if(sr>er){
                break;
            }
            matrix[er][j]=k;
             k++;
          }
          er--;
          for(int i=er;i>=sr;i--){
            if(sc>ec){
                break;
            }
            matrix[i][sc]=k;
             k++;
          }
          sc++;
        }
        return matrix;
        
    }
}