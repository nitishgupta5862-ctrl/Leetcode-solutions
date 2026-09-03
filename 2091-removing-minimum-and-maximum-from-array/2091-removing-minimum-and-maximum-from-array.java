class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int minidx=0;
        int maxidx=0;
        int max=Integer.MIN_VALUE;
        int fmax=0;
        int fmin=0;
    
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                minidx=i;

            }
            if(max<nums[i]){
                max=nums[i];
                maxidx=i;
            }

        }
        int left=Math.min(minidx,maxidx);
        int right=Math.max(minidx,maxidx);
        //optional-1  Both from left
        int option1=right+1;
        //option-2 both from right
        int option2=n-left;
        //option -3 one from left and one from right
        int option3=(left+1)+(n-right);


    
        
    
    return Math.min(option1,Math.min(option2,option3));
}
}