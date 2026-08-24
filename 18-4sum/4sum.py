class Solution(object):
    def fourSum(self, nums, target):
        size = len(nums)
        final = []

        nums.sort()

        for i in range(size - 3):

            # Skip duplicate i
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            for j in range(i + 1, size - 2):

                # Skip duplicate j
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue

                left = j + 1
                right = size - 1

                while left < right:

                    total = nums[i] + nums[j] + nums[left] + nums[right]

                    if total == target:

                        final.append([
                            nums[i],
                            nums[j],
                            nums[left],
                            nums[right]
                        ])

                        # Skip duplicate left values
                        while left < right and nums[left] == nums[left + 1]:
                            left += 1

                        # Skip duplicate right values
                        while left < right and nums[right] == nums[right - 1]:
                            right -= 1

                        left += 1
                        right -= 1

                    elif total > target:
                        right -= 1

                    else:
                        left += 1

        return final