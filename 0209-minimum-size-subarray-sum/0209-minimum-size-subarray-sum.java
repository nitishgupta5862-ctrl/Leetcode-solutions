// class Solution {
//     public int minSubArrayLen(int target, int[] nums) {
//         int len=0;
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum +=nums[j];;
//                 if(sum >=target){
                    
//                    len=j-i+1;

//                     if(min>len){    //brute force
//                         min=len;
//                     }
//                     break;

//                 }
//             }
//         }
//         return min==Integer.MAX_VALUE?0:min;
//     }
// }

class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++) {

            sum += nums[right];

            while(sum >= target) {

                int len = right - left + 1;
                min = Math.min(min, len);

                sum -= nums[left];
                left++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}