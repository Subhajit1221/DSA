class Solution(object):
    def findMissingAndRepeatedValues(self, grid):
        
        n=len(grid[0])
        checker=[False]*(n*n+1)
        repeat=0
        answer=[]

        for i in range(n):
            for j in range(n):
                if checker[grid[i][j]]==False:
                    checker[grid[i][j]]=True
                else:
                    repeat=grid[i][j]

        
        answer.append(repeat)
        for i in range(1,len(checker)):
            if checker[i]==False:
                answer.append(i)
                break
        
        return answer