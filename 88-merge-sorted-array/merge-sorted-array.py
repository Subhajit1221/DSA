class Solution(object):
    def merge(self, nums1, m, nums2, n):
        
        total=[]
        x=0
        y=0        
        
        while(x<m and y<n):
            
            if(nums1[x]<nums2[y]):
               total.append(nums1[x])
               x=x+1
                
            elif(nums1[x]>nums2[y]):
               total.append(nums2[y])
               y=y+1
            else:
                total.append(nums1[x])
                total.append(nums1[x])
                x=x+1
                y=y+1
                
 
        
        while(x<m):
            total.append(nums1[x])
            x=x+1

        while(y<n):
            total.append(nums2[y])
            y=y+1

        nums1[:] = total