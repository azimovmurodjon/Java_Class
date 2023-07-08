package Loop;

/*
Output

Multiplication of two matrices is:
24    29
6    25
In the above program, the multiplication takes place as:

|-    (a11 x b11) + (a12 x b21) + (a13 x b31)    (a11 x b12) + (a12 x b22) + (a13 x b32)    -|
|_    (a21 x b11) + (a22 x b21) + (a23 x b31)    (a21 x b12) + (a22 x b22) + (a23 x b32)    _|
In our example, it takes place as:

|-    (3 x 2) + (-2 x -9) + (5 x 0) = 24    (3 x 3) + (-2 x 0) + (5 x 4) = 29    -|
|_    (3 x 2) + ( 0 x -9) + (4 x 0) = 6    (3 x 3) + ( 0 x 0) + (4 x 4) = 25    _|
 */
public class MultiplyMatrices {
    public static void main(String[] args) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = {{3, -2, 5}, {3, 0, 4}};
        int[][] secondMatrix = {{2, 3}, {-9, 0}, {0, 4}};

        // Mutliplying Two matrices
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Displaying the result
        System.out.println("Multiplication of two matrices is: ");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
