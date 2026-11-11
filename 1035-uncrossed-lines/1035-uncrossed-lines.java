class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        
        int n=nums1.length;
        int m=nums2.length;
       int dp[][]=new int[n+1][m+1];
       for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            if(nums1[i-1]==nums2[j-1]){
             dp[i][j]=1+dp[i-1][j-1];
            }else{
                int ans1=dp[i-1][j];
                int ans2=dp[i][j-1];
                dp[i][j]=Math.max(ans1,ans2);
            }
        }
       }
       return dp[n][m];
    }
}