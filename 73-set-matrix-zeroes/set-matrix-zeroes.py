class Solution(object):
    def setZeroes(self, matrix):

       
       

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j]==0):
                    # matrix[i][j] = float('inf')
                    for x in  range(len(matrix)):
                        if(matrix[x][j]!=0):
                            matrix[x][j]= float('inf')
                    for y in  range(len(matrix[0])):
                        if(matrix[i][y]!=0):
                            matrix[i][y]= float('inf')
                

                


        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if(matrix[i][j]==float('inf')):
                    matrix[i][j] = 0
        


        return matrix