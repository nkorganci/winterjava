package day41designpatterns.datastructure.arrays;

public class RotateImage {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Swap matrix matrix[j][i];
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse of rows
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                // Swap matrix
                int temp= matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }

        }
    }
}
