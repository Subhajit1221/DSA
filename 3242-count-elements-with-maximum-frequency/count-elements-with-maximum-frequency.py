class Solution(object):
    def maxFrequencyElements(self, nums):
        
        

        frequency=[0] * 101

        for i in nums:
            frequency[i]+=1
        
        maxi=0
        for i in range (101):
            if maxi<frequency[i]:
                maxi=frequency[i]
        
        count=0
        for i in range (101):
            if maxi==frequency[i]:
                count+=1
        
        return maxi*count


        