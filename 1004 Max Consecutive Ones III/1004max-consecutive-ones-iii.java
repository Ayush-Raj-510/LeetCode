class Solution {
    public int longestOnes(int[] nums, int k) {
        int low=0;
        int ans=Integer.MIN_VALUE;
        int zerocount=0;
        for(int high=0;high<nums.length;high++){
            if(nums[high]==0){
                zerocount++;
            }
            while (zerocount > k) {
                if (nums[low] == 0) {
                    zerocount--;
                }
                low++;
            }
            int len=high-low+1;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}