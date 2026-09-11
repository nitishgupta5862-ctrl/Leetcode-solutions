class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currmax=0;
        int maxsum=Integer.MIN_VALUE;
        int currmin=0;
        int minsum = Integer.MAX_VALUE;
        int total=0;
        for(int num:nums){
            currmax=Math.max(num,currmax+num);   //calculate maxsum 
            maxsum=Math.max(maxsum,currmax);

            currmin=Math.min(num,currmin+num);
            minsum=Math.min(minsum,currmin);

            total +=num;
        }
        if(maxsum<0){
            return maxsum;
        }
        int circularsum=total-minsum;
        return Math.max(circularsum,maxsum);
        
    }
}