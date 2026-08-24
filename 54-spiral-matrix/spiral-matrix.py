class Solution(object):
    def spiralOrder(self, matrix):
        
        m = len(matrix)
        n = len(matrix[0])
        l = [0] * (m*n)

        top = 0
        left = 0
        bottom = m-1
        right = n-1
        x = 0

        while (top <= bottom and left <= right):

            # top row →
            for i in range(left, right+1):
                l[x] = matrix[top][i]
                x += 1
            top += 1

            # right column ↓
            if top <= bottom:
                for i in range(top, bottom+1):
                    l[x] = matrix[i][right]
                    x += 1
                right -= 1

            # bottom row ←
            if left <= right and top <= bottom:
                for i in range(right, left-1, -1):
                    l[x] = matrix[bottom][i]
                    x += 1
                bottom -= 1

            # left column ↑
            if top <= bottom and left <= right:
                for i in range(bottom, top-1, -1):
                    l[x] = matrix[i][left]
                    x += 1
                left += 1

        return l