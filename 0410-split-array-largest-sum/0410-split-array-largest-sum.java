class Solution {

    public boolean isValid(int[] nums, int maxSum, int k) {

        int count = 1;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {

            if (currentSum + nums[i] <= maxSum) {
                currentSum += nums[i];
            } 
            else {
                // Current subarray complete
                count++;
                 if (count > k||nums[i]>maxSum) {
                    return false;
                }

                // New subarray current element se start
                currentSum=0;
                currentSum += nums[i];

              
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        int low = 0;
        int high = 0;

        // low = maximum element
        // high = total sum
        for (int i = 0; i < nums.length; i++) {
            
            high += nums[i];
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isValid(nums, mid, k)) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}