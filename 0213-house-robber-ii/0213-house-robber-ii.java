class Solution {
    public int rob(int[] nums) {
        //isme circular diya hai array aur isme agar hm first lenge to last nhi agar first nhi to last lenge
        //isme do case lga denge ek baar fisrst include and ekbaar first not include
        int n=nums.length;
        if(n==1)return nums[0];
        int dp1[]=new int[n];
        Arrays.fill(dp1,-1);
        int dp2[]=new int[n];
        Arrays.fill(dp2,-1);
        int case1=solve(nums,0,dp1,n-2);
        int case2=solve(nums,1,dp2,n-1);
        return Math.max(case1,case2);
    }
    public int solve(int nums[],int idx,int dp[],int n){
        if(idx>n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int include=nums[idx]+solve(nums,idx+2,dp,n);
        int exclude=0+solve(nums,idx+1,dp,n);
        dp[idx]=Math.max(include,exclude);
        return dp[idx];
        
    }
}