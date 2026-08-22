class Solution(object):
    def areSimilar(self, mat, k):
        
        mat1 = []

        for row in mat:
            mat1.append(row[:])

        i = 0 
        m=len(mat)
        n=len(mat[0])
        while(k!=0):
            while(i<m):
                if (i%2==0):
                    mat[i].append(mat[i].pop(0))
                else:
                    mat[i].insert(0,mat[i].pop(n-1))
            
                i=i+1
            k-=1
            i=0

          

        if(mat1==mat):
            return True
        else:
            return False
        