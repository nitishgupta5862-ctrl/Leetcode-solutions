class Solution {
    public int longestOnes(int[] nums, int k) {
        //brute force
        int len=0;
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int zeros=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==0){
                    zeros++;}
                    if(zeros<=k){
                        len=j-i+1;
                        maxlen=Math.max(maxlen,len);
                    }else{
                        break;
                    }
                }
            }
        return maxlen;
    }
}