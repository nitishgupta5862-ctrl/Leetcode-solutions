class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fs=Integer.MAX_VALUE;
        int sc=Integer.MAX_VALUE;
        for(int num :nums){
            if(num<=fs){
                fs=num;
            }else if(num<=sc){
                sc=num;
            }else{
                return true;
            }
        }
        return false;
    }
}