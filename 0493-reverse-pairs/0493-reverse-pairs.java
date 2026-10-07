class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int[] nums, int low, int high) {
        int count = 0;


        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
        }
        return count;
    }

    int merge(int[] nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int left = low; left <= mid; left++) {
            while (right <= high &&
                   (long) nums[left] > 2L * nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        int[] temp = new int[high - low + 1];
        int left = low;
        right = mid + 1;
        int idx = 0;
        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp[idx++] = nums[left++];
            } else {
                temp[idx++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[idx++] = nums[left++];
        }
        while (right <= high) {
            temp[idx++] = nums[right++];
        }
        System.arraycopy(temp, 0, nums, low, high - low + 1);
        return count;
    }
}