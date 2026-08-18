class Solution {
    public int jump(int[] nums) {
    //     int idx=0;
    //     int minjump=0;
    //    return miump(idx,minjump,nums);
    // }
    // public int miump(int idx,int minjump,int[]nums){
    //     int min=Integer.MAX_VALUE;                   //tle dega
    //     if(idx>=nums.length-1){
    //         return minjump;
    //     }
        

    //     for(int i=1;i<=nums[idx];i++){
    //      min=Math.min(min,miump(idx+i,minjump+1,nums));
    //     }
    //     return min;
    int jumps=0;
    int left=0;
    int right=0;
    while(right<nums.length-1){
        int furthest=0;
        for(int idx=left;idx<=right;idx++){
            furthest=Math.max(furthest,idx+nums[idx]);
        }
            left=right+1;
            right=furthest;
            jumps++;
        }
    
    return jumps;
    }
}