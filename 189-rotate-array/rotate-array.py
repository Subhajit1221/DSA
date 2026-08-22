class Solution(object):

    def rotate_me(self, nums, left, right):

        k=left+right

        for i in range(left,k//2 +1):
            temp=nums[i]
            nums[i]=nums[right]
            nums[right]=temp
            right-=1


        

    def rotate(self, nums, k):

        n = len(nums)

        if n == 0:
            return nums

        k = k % n

        
        if(n>k):
            self.rotate_me(nums, 0, n - k-1)
            self.rotate_me(nums, n - k, n-1)
            self.rotate_me(nums, 0, n-1)

        return nums