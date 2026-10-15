class Solution {
    public long maxKelements(int[] nums, int k) {
     long score=0;
     PriorityQueue<Long> pq=new PriorityQueue<>((a,b)->Long.compare(b,a));
     for(int i=0;i<nums.length;i++){
        pq.add((long)nums[i]);
     }
     while(k>0){
        long max=pq.remove();
        score +=max;
        pq.add((max+2)/3);
        k--;
     }
     return score;
    }
}