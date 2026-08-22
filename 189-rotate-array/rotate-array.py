class Solution(object):

    def rotate_me(self, nums, left, right):

        right -= 1

        while left < right:
            temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp

            left += 1
            right -= 1

        return nums

    def rotate(self, nums, k):

        n = len(nums)

        if n == 0:
            return nums

        k = k % n

        nums = self.rotate_me(nums, 0, n - k)
        nums = self.rotate_me(nums, n - k, n)
        nums = self.rotate_me(nums, 0, n)

        return nums