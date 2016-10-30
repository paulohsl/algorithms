package br.com.paulo.firecode;


public class FlipVerticalAxis {


    public static void main(String[] args) {

        int[][] matrix = {{1, 0}};

        flipItVerticalAxis(matrix);
    }

    public static void flipItVerticalAxis(int[][] matrix) {

        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = matrix[i][j];
                int index = matrix[j].length - j - 1;
                matrix[i][j] = matrix[i][index];
                matrix[i][index] = temp;
            }
        }
    }
}
