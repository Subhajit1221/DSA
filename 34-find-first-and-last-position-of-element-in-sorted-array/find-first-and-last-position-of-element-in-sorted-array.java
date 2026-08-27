class Solution {

    // Finds the FIRST index where nums[index] >= target
    public int flb(int[] nums, int target, int i, int j, int lb) {

        if (i > j) {
            return lb;
        }

        int mid = i + (j - i) / 2;

        if (nums[mid] >= target) {
            lb = mid;
            j = mid - 1;          // Search on left
        } else {
            i = mid + 1;          // Search on right
        }

        return flb(nums, target, i, j, lb);
    }


    // Finds the FIRST index where nums[index] > target
    public int fub(int[] nums, int target, int i, int j, int ub) {

        if (i > j) {
            return ub;
        }

        int mid = i + (j - i) / 2;

        if (nums[mid] > target) {
            ub = mid;
            j = mid - 1;          // Search on left
        } else {
            i = mid + 1;          // Search on right
        }

        return fub(nums, target, i, j, ub);
    }


    public int[] searchRange(int[] nums, int target) {

        int n = nums.length;

        // Find first occurrence
        int first = flb(nums, target, 0, n - 1, -1);

        // Target doesn't exist
        if (first == -1 || nums[first] != target) {
            return new int[]{-1, -1};
        }

        // Find last occurrence
        int last = fub(nums, target, 0, n - 1, n) - 1;

        return new int[]{first, last};
    }
}