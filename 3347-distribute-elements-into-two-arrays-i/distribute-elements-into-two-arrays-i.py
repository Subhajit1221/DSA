class Solution(object):
    def resultArray(self, nums):
        
        arr1=[]
        arr2=[]
        size=len(nums)

        arr1.append(nums[0])
        arr2.append(nums[1])

        x=0
        y=0
        
        
        for i in range(2,size):

            if arr1[len(arr1)-1]>arr2[len(arr2)-1]:
                arr1.append(nums[i])
            else:
                arr2.append(nums[i])

        result=[]

        for i in arr1:
            result.append(i)

        for i in arr2:
            result.append(i)
 

        return result