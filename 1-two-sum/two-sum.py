class Solution(object):
    def twoSum(self, nums, target):
        left=0
        right=len(nums)-1
        newnums=nums[:]
        nums.sort()
        while(left<right):
            sum=nums[left]+nums[right]
            if(sum<target):
                left=left+1
            elif(sum>target):
                right=right-1
            else:
                break
        
        left_value = nums[left]
        right_value = nums[right]

        for i in range(len(newnums)):
            if newnums[i] == left_value:
                left_index = i
                break

        for i in range(len(newnums)):
            if newnums[i] == right_value and i != left_index:
                right_index = i
                break

        return  left_index,right_index    