package br.com.paulo.firecode;


public class FlipHorizontalAxis {


    public static void main(String[] args) {

        int[][] matrix = {{1, 0, 0}, {0, 0, 1}};

        int num = 5 / 2;


        System.out.println(flipHorizontalAxis(matrix));

    }

    public static int[][] flipHorizontalAxis(int[][] matrix) {

        int r = matrix.length;

        for (int i = 0; i <= r / 2; i++) {
            int[] temp = matrix[i];
            int index = matrix.length - i - 1;
            matrix[i] = matrix[index];
            matrix[matrix.length - i - 1] = temp;
        }

        return matrix;
    }

    public static void flipHorizontalAxisSite(int[][] matrix) {
        int r = matrix.length - 1, c = matrix[0].length - 1;
        int temp = 0;
        for (int i = 0; i <= r / 2; i++) {
            for (int j = 0; j <= c; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[r - i][j];
                matrix[r - i][j] = temp;
            }
        }
    }
}
