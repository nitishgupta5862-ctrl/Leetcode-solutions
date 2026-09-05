class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int leftmax[]=new int[nums.length];
        int righmin[]=new int[nums.length];
        leftmax[0]=nums[0];
        for(int i=1;i<leftmax.length;i++){
            leftmax[i]=Math.max(nums[i],leftmax[i-1]);
        }
        righmin[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            righmin[i]=Math.min(righmin[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
        if((leftmax[i]-righmin[i])<=k){
            return i;
        }
        }
        return -1;
    }
}