class Solution(object):
    def longestConsecutive(self, nums):

        size=len(nums)

        if(size==0):
            return 0
        
        nums.sort()

        

        count=1
        max=0

        for i in range ( size-1):

            if nums[i+1]-nums[i]==1:
                count+=1
            elif nums[i+1]-nums[i]==0:
                 continue
            else:
                if(max<count):
                    max=count
                count=1

        if(max<count):
            max=count

        return max