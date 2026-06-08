class Solution {
    public int maxSubArray(int[] nums) {
        int currsum = nums[0];
        int maxmsum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int v1 = nums[i];
            int v2 = currsum + nums[i];
            currsum = Math.max(v1, v2);
            maxmsum = Math.max(maxmsum, currsum);
        }
        return maxmsum;
    }
}
