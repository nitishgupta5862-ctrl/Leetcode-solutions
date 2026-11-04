class Solution {
    public int change(int amount, int[] coins) {
    //     int index=0;
    //     return solve(amount,coins,index);
    // }
    // public int solve(int amount,int[]coins,int index){
    //     if(amount==0){
    //         return 1;  //yani 1 case solve hogya
    //     }
    //     if(index==coins.length)return 0;//index bahar hogya to koi ways nhi hai
    //     int includeans=0;     //isliye kyuki if ke andar declare karenge to bahar acces nhi kar payenge
    //     if(amount>=coins[index]){
    //      includeans=solve(amount-coins[index],coins,index); //index increase nhi karenge jb tak
    //     }                                                  //kam hoga usse
    //     int excludeans=solve(amount,coins,index+1);
    //     return includeans+excludeans;

       int n=coins.length;
       int dp[][]=new int[n+1][amount+1];
       for(int i=0;i<n+1;i++){
        dp[i][0]=1;
       } 
       for(int j=0;j<amount+1;j++){
        dp[0][j]=0;
       }
       for(int i=1;i<n+1;i++){
        for(int j=1;j<amount+1;j++){
            if(coins[i-1]<=j){
                dp[i][j]=dp[i][j-coins[i-1]]+dp[i-1][j];
            }
            else{
                dp[i][j]=dp[i-1][j];
            }
        }
       }
       return dp[n][amount];


    }
}