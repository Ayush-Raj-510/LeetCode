class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int high = 0;
        int low = 0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        while (high < nums.length) {
            sum = nums[high] + sum;
            while (sum >= target) {
                int len = high - low + 1;
                ans = Math.min(ans, len);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}