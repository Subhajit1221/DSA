class Solution(object):
    def checkDivisibility(self, n):
        sum=0
        product=1

        f=n
        
        while(n>0):
            d=n%10
            
            sum=sum+d
            product*=d

            n=n/10

        

        sum=sum+product
            


            

        if(sum==0):
            return False

        if(f%sum==0):
            return True
            
        return False
            
        