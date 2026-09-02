class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=position[position.length-1]+position[0];
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isValid(position,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public boolean isValid(int position[],int mindistance,int m){
        int count=1;
        int lastposition=0;
        for(int i=1;i<position.length;i++){
            if(position[i]-position[lastposition]>=mindistance){
                count++;
                lastposition=i;
                if(count==m){
                    return true;
                }
            }
        }
        return false;
    }
}