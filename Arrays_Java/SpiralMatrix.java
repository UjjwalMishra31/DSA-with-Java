package Arrays_Java;

public class SpiralMatrix {
    public static void main(String[] args) {
        // Example input matrix
        int[][] matrix = {
                {1, 5, 7, 9, 10, 11},
                {6, 10, 12, 13, 20, 21},
                {9, 25, 29, 30, 32, 41},
                {15, 55, 59, 63, 68, 70},
                {40, 70, 79, 81, 95, 105}
        };

        System.out.println("Spiral order of the matrix:");
        printSpiralOrder(matrix);
    }

    public static void printSpiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;
            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;
            // Traverse from right to left, if applicable
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }
            // Traverse from bottom to top, if applicable
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
            }
            left++;
        }
    }
}
