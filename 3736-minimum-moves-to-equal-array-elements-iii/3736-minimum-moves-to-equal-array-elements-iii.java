class Solution {
    public int minMoves(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max){
                max=num;
            }
        }
        int min=0;
        for(int num:nums){
            min +=max-num;
        }
       return min;
    }
}