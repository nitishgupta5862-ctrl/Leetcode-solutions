class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n+1][amount+1];
        for(int i=0;i<n+1;i++){
            dp[i][0]=0;
        }
        for(int j=1;j<amount+1;j++){
            dp[0][j]=1000000;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<amount+1;j++){
                if(coins[i-1]<=j){
                int take=1+dp[i][j-coins[i-1]];
                int skip=dp[i-1][j];
                dp[i][j]=Math.min(take,skip);
            }   else{
                dp[i][j]=dp[i-1][j];
            }
            }
        }
        if(dp[n][amount]>=1000000){
            return -1;
        }
        return dp[n][amount];
    }
}