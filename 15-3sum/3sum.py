class Solution(object):
    def threeSum(self, nums):

        nums.sort()

        size = len(nums)
        final = []

        for i in range(size - 2):

            # Skip duplicate values of i
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            left = i + 1
            right = size - 1

            while left < right:

                total = nums[i] + nums[left] + nums[right]

                if total == 0:

                    final.append([nums[i], nums[left], nums[right]])

                    # Skip duplicate left values
                    while left < right and nums[left] == nums[left + 1]:
                        left += 1

                    # Skip duplicate right values
                    while left < right and nums[right] == nums[right - 1]:
                        right -= 1

                    left += 1
                    right -= 1

                elif total < 0:
                    left += 1

                else:
                    right -= 1

        return final