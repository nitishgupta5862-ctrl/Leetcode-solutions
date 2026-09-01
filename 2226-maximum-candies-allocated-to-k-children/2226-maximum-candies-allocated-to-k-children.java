class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=0;
        for(int candi:candies){
            high=Math.max(candi,high);

        }
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            long totalc=0;
            for(int candi:candies){
                totalc +=candi/mid;
            }
            if(totalc>=k){
                ans=mid;
                low=mid+1;
            }
            else{
               high= mid-1;
            }
        }
        return ans;
    }
}