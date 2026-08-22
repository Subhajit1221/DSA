class Solution(object):
    def areSimilar(self, mat, k):

        m = len(mat)
        n = len(mat[0])

        k = k % n

        for i in range(m):

            if i % 2 == 0:
                # even row -> left shift
                shift = k
            else:
                # odd row -> right shift
                shift = n - k

            for j in range(n):
                if mat[i][j] != mat[i][(j + shift) % n]:
                    return False

        return True