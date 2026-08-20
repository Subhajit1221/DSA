class Solution(object):
    def sortColors(self, nums):
        
        checker=[0]*3
        

        for i in nums:
            checker[i]+=1

        nums[:] = []
        
        for i in range(3):
            while(checker[i]!=0):
                nums.append(i)
                checker[i]-=1
            