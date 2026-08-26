class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];
            int rev=0;
            while(temp>0){
                rev=rev*10+temp%10;
                temp=temp/10;
            }
            set.add(rev);
            set.add(nums[i]);
        }
        return set.size();
        
    }
}