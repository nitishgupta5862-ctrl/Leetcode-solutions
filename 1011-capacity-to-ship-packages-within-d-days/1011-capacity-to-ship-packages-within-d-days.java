class Solution {
    public boolean canship(int weights[],int days,int capacity){
        int currweight=0;
       int requireddays=1;
        for(int weight :weights){
            if(weight+currweight>capacity){
                requireddays++;
                currweight=0;
            }
                currweight +=weight;
            
        }
       return  requireddays <=days;

    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high +=weights[i];
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canship(weights,days,mid)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}