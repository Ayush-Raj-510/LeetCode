class Solution {
    int findPivot(int[] nums){
        int low = 0, high = nums.length - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return (low - 1 + nums.length) % nums.length;
    }

    int binarySearch(int[] nums, int low, int high, int target){
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int left = binarySearch(nums, 0, pivot, target);
        if(left != -1) return left;
        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }
}