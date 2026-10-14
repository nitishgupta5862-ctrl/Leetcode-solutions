class Solution {
    public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    for(int num:nums){
        pq.add(num);
    }
    int kth=pq.size()-k;
    for(int i=0;i<kth;i++){
        pq.remove();
    }
    return pq.remove();
        
    }
}