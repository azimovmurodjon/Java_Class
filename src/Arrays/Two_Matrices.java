package Arrays;

/*
Output

Sum of two matrices is:
-2    8    7
10    8    6
In the above program, the two matrices are stored in 2d array, namely firstMatrix and secondMatrix. We've also defined the number of rows and columns and stored them in variables rows and columns respectively.

Then, we initialize a new array of the given rows and columns called sum. This matrix array stores the addition of the given matrices.

We loop through each index of both arrays to add and store the result.

Finally, we loop through each element in the sum array using the for-each loop to print the elements.
 */
public class Two_Matrices {
    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {2, 3, 4}, {5, 2, 3} };
        int[][] secondMatrix = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
