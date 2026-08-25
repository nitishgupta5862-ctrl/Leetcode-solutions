class Solution {
    public int missingMultiple(int[] nums, int k) {
        //  HashSet<Integer> set=new HashSet<>();
        //  for(int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        //  }
        //  for(int i=k;i<=k*nums.length;i=i+k){
        //     if(!set.contains(i)){
        //         return i;
        //     }
        //  }
        // return k*(nums.length+1);

        Arrays.sort(nums);
        // [2,3,4,6,8]
        int j=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==j){
                j +=k;
            }
            else if(nums[i]<j){
                continue;
            }
            else{
                return j;
            }
        }
        return j;
    }
}