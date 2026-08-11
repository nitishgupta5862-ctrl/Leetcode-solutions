class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(ele>0){
                set.add(ele);
            }
        }
        int small=1;
        while(true){
        if(!set.contains(small)){
            return small;
        }
        else{
            small++;
        }
        }
    }
}