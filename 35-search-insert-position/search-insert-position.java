class Solution {

    public static int search_loc(int[] nums, int target, int i, int j) {

        if (i > j) {
            return i;
        }

        int mid = (i + j) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        else if (nums[mid] > target) {
            return search_loc(nums, target, i, mid - 1);
        }
        else {
            return search_loc(nums, target, mid + 1, j);
        }
    }

    public int searchInsert(int[] nums, int target) {

        int size = nums.length;

        if (size == 0) {
            return 0;
        }

        return search_loc(nums, target, 0, size - 1);
    }
}