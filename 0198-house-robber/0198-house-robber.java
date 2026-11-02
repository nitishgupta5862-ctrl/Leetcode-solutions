class Solution {
    public int rob(int[] nums) {
        int index=0;
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);

       return solve(nums,index,dp);
    }
    public int solve(int nums[],int idx,int dp[]){
        //base case
        if(idx>=nums.length)return 0;
        //1 case mai solve karunga baki recursion karega
        //include or exclude pattern
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int includeans=nums[idx]+solve(nums,idx+2,dp);
        //exclude
        int excludeans=0+solve(nums,idx+1,dp);
        int finalans=Math.max(includeans,excludeans);
        return dp[idx]= finalans;
    }
}