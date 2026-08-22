class Solution(object):
    def rearrangeArray(self, nums):
        
        positive=[]
        negative=[]
        result=[]
        n=len(nums)//2
        for i in nums:
            if i>0:
                positive.append(i)
            else:
                negative.append(i)
        

        for i in range(n):
            result.append(positive[i])
            result.append(negative[i])

        return result    