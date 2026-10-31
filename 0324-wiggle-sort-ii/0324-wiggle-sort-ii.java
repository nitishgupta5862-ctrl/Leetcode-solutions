class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=(n+1)/2;
         int i=mid-1;
         int j=n-1;
         int ans[]=new int[n];
         for(int k=0;k<n;k++){
            if(k%2==0){
                ans[k]=nums[i--];
            }else{
                ans[k]=nums[j--];
            }
         }
         for(int k=0;k<n;k++){
           nums[k]=ans[k];
         }
    }
}