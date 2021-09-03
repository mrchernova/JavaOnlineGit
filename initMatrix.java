public static void main(String[] args) {
  int[][] matrix = new int[n][n];
  initMatrix(matrix);
}


// матрица от [-9..9]
public static void initMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                matrix[i][j] = (int) (Math.random() * 20 - 10);
            }
        }
    }

