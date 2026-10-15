class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       
    //    if(nums.length<1)return nums;
    //      int j=0;                                     ///TLE
    //      ArrayList<Integer> ans=new ArrayList<>();
    //     while(j<=nums.length-k){
    //        int max=Integer.MIN_VALUE;
    //        for(int i=j;i<j+k;i++){
    //         max=Math.max(nums[i],max);
    //      }
    //      ans.add(max);
    //      j++;
           
    // }
    // int res[]=new int[ans.size()];
    // for(int i=0;i<ans.size();i++){
    //     res[i]=ans.get(i);
    // }

    // return res;
    int n=nums.length;
    int res[]=new int[n-k+1];
    PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(b[0],a[0]));
    for(int i=0;i<k;i++){
     pq.add(new int[]{nums[i],i});
    }
    res[0]=pq.peek()[0];//nums[i]yano value 
    for(int i=k;i<n;i++){
        while(pq.size()>0 &&pq.peek()[1]<=(i-k)){
            pq.remove();
        }
        pq.add(new int[]{nums[i],i});
        res[i-k+1]=pq.peek()[0];
    }
    return res;
    }
}