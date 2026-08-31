class Solution {
    public int countSpecialIntegers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            boolean first=true;
            for(int k=0;k<i;k++){
                if(nums[k]==nums[i]){
                    first=false;
                    break;
                }
            }
            if(!first){
                continue;
            }
            boolean special=true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    if(nums[j-1 ]!=nums[i]){
                        special=false;
                        break;
                    }
                }
            }
            if(special){
                count++;
            }
        }
        return count;
    }
}