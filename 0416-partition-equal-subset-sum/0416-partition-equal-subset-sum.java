class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int total=0;                       //same code 0-1 knapsack bs isme taget =totalsum/2
        for(int x:nums){                    //and agar total%2!=0 hoga to odd hoga to answer 
            total +=x;     
                                         //always false hoga kyuki divide nhi ho payega                                  //two parsts me
        }
        int target=total/2;
        if(total%2!=0)return false;
        boolean dp[][]=new boolean[n+1][target+1];
        //base  case
        for(int i=0;i<n+1;i++){
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<target+1;j++){
                int v=nums[i-1];
                //include
                if(v<=j &&dp[i-1][j-v]==true){
                    dp[i][j]=true;
                }
                //exclude
                else if(dp[i-1][j]==true){
                    dp[i][j]=true;
                }
            }
        }
        return dp[n][target];
    }
}