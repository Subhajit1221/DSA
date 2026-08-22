class Solution(object):
    def maxProduct(self, nums):

        nums.sort()

        s=len(nums)

        return (nums[s-1]-1)*(nums[s-2]-1)
    
        