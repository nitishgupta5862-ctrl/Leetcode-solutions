class Solution {
    public int missingMultiple(int[] nums, int k) {
         HashSet<Integer> set=new HashSet<>();
         for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
         }
         for(int i=k;i<=k*nums.length;i=i+k){
            if(!set.contains(i)){
                return i;
            }
         }
        return k*(nums.length+1);
    }
}