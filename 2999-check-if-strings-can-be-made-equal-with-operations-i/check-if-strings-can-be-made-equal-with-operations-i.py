class Solution(object):
    def canBeEqual(self, s1, s2):        
       
        
        if(s1==s2):
            return True
        else:
            s3=s2[2]+s2[1]+s2[0]+s2[3]
            s4=s2[0]+s2[3]+s2[2]+s2[1]
            s5=s2[2]+s2[3]+s2[0]+s2[1]
        

        if(s1==s3 or s1==s4 or s1==s5):
            return True
        
        return False