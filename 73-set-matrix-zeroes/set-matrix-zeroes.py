class Solution(object):
    def setZeroes(self, matrix):

       
        row=[]
        column=[]

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j]==0):
                    row.append(i)
                    column.append(j)
                


        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i  in row or j in column:
                   matrix[i][j]=0
        


        return matrix