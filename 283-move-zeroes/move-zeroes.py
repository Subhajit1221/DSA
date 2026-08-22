class Solution(object):
    def moveZeroes(self, nums):

        count=0
        size=len(nums)
        j=0

        for i in range(size):
            if(nums[i]==0):
                count+=1
            else:
                nums[j]=nums[i]
                j+=1
        
        print j
        
        while(count>0):
            nums[j]=0
            j+=1
            count-=1
        
        return nums
        