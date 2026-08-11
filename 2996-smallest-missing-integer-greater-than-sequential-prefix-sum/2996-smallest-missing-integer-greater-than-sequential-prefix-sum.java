class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int sum=nums[0];//prefix sum 0 se start hota hai
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum +=nums[i];
            }
            else{
                break;
            }
        }
        for(int ele:nums){
            set.add(ele);
        }
       while(true){
        if(!set.contains(sum)){
            return sum;
        }
        else{
            sum++;
        }
       }
        
    }
}