class Solution(object):
    def rearrangeArray(self, nums):
        
        positive=[]
        negative=[]
        result=[]

        for i in nums:
            if i>0:
                positive.append(i)
            else:
                negative.append(i)
        

        for i in range(len(nums)//2):
            result.append(positive[i])
            result.append(negative[i])

        return result    