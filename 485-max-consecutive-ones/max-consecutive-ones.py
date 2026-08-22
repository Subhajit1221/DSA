class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        
        max=0
        count=0
        n=len(nums)

        for i in range(0,n):
            if(nums[i]==1):
                count+=1
            else:
                if(max<count):
                    max=count
                count=0
        
        if(max<count):
            max=count
        
        return max