class Solution {
    public int climbStairs(int n) {
    //     if(n<=2)return n;     tabulation;
    //   int dp[]=new int [n+1];
    //   dp[1]=1;
    //   dp[2]=2;
    //   for(int i=3;i<=n;i++){
    //     dp[i]=dp[i-1]+dp[i-2];
    //   }
       
    //    return dp[n];

    int dp[]=new int[n+1];
    Arrays.fill(dp,-1);
    return ways(n,dp);
    }
    public int ways(int n,int dp[]){
        if(n==0)return 1;
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        dp[n]=ways(n-1,dp)+ways(n-2,dp);
        return dp[n];
    }
}