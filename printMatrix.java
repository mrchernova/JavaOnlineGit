public static void main(String[] args) {
  printMatrix(matrix);
}

public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.format("%3s", matrix[i][j]);
            }
            System.out.println();
        }
    }
