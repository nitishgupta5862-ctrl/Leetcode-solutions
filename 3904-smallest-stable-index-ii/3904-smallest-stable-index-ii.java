class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int leftmax[]=new int[nums.length];
    
        leftmax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            leftmax[i]=Math.max(leftmax[i-1],nums[i]);
        }
        int rightmin[]=new int[nums.length];
        rightmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rightmin[i]=Math.min(rightmin[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(leftmax[i]-rightmin[i]<=k){
                return i;
            }
        }
        return -1;
    }
}