class Solution(object):
    def setZeroes(self, matrix):

        rows = len(matrix)
        columns = len(matrix[0])

        # Check whether first row has a zero
        first_row_zero = False

        for j in range(columns):
            if matrix[0][j] == 0:
                first_row_zero = True

        # Check whether first column has a zero
        first_column_zero = False

        for i in range(rows):
            if matrix[i][0] == 0:
                first_column_zero = True

        # Use first row and first column as markers
        for i in range(1, rows):
            for j in range(1, columns):

                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0

        # Make rows zero
        for i in range(1, rows):
            if matrix[i][0] == 0:

                for j in range(1, columns):
                    matrix[i][j] = 0

        # Make columns zero
        for j in range(1, columns):
            if matrix[0][j] == 0:

                for i in range(1, rows):
                    matrix[i][j] = 0

        # Finally, handle first row
        if first_row_zero:
            for j in range(columns):
                matrix[0][j] = 0

        # Finally, handle first column
        if first_column_zero:
            for i in range(rows):
                matrix[i][0] = 0

        return matrix