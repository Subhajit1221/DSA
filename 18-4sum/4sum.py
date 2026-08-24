class Solution(object):
    def fourSum(self, nums, target):
        size=len(nums)
        left=2
        right=size-1

        
        final=[]
        curr=[]
       

        nums.sort()
        
        for i in range(size-3):
            for j in range(i+1,size-2):
                left=j+1
                right=size-1
                
                while left<right:
                    total=nums[i] + nums[j] + nums[left] + nums[right]

                    if total==target:
                        curr.append(nums[i])
                        curr.append(nums[j])
                        curr.append(nums[left])
                        curr.append(nums[right])

                        if curr not in final:
                            final.append(curr)
                        
                        curr=[]
                    
                        left += 1
                        right -= 1
                    
                    elif total>target:
                        right-=1
                    
                    else:
                        left+=1
        return final
