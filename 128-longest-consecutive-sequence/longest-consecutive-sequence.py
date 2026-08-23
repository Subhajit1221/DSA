class Solution(object):
    def longestConsecutive(self, nums):

        

        nums_set = set(nums)

        size=len(nums_set)

        if(size==0):
            return 0
        
      

        

        count=1
        max=0

        for i in nums_set:

            if i-1 not in nums_set:
                count=1

                while i+ count in nums_set:
                    count+=1
            
                if(max<count):
                    max=count
                

       

        return max