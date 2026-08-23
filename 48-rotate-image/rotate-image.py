class Solution(object):
    def rotate(self, matrix):

        n=len(matrix)
        for i in range(n):
            for j in range(i,n):
                temp=matrix[i][j]
                matrix[i][j]=matrix[j][i]
                matrix[j][i]=temp

        i=0
        while(i<n):
            for j in range(n//2):
                temp=matrix[i][j]
                matrix[i][j]=matrix[i][n-j-1]
                matrix[i][n-j-1]=temp

            i+=1