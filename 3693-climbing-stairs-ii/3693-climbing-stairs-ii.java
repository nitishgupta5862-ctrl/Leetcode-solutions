class Solution {
    public int climbStairs(int n, int[] cost) {
        int dp[]=new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
            if(i>=1){
                dp[i]=Math.min(dp[i],dp[i-1]+cost[i-1]+1);
            }
             if(i>=2){
                dp[i]=Math.min(dp[i],dp[i-2]+cost[i-1]+4);
            }
             if(i>=3){
                dp[i]=Math.min(dp[i],dp[i-3]+cost[i-1]+9);
            }
        }
        return dp[n];
    }
}