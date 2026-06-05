class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0, idx = 0;
        int[] arr = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                arr[idx] = nums1[i];
                i++;
                idx++;
            } else {
                arr[idx] = nums2[j];
                j++;
                idx++;
            }
        }

        while (i < m) {
            arr[idx] = nums1[i];
            i++;
            idx++;
        }

        while (j < n) {
            arr[idx] = nums2[j];
            j++;
            idx++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = arr[k];
        }
    }
}