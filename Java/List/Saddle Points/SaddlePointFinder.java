public class SaddlePointFinder {
    public static void main(String[] args) {
        int[][] matrix = {
            {9, 8, 7},
            {5, 3, 2},
            {6, 6, 7}
        };

        findSaddlePoints(matrix);
    }

    public static void findSaddlePoints(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int currentElement = matrix[i][j];
                boolean isSaddlePoint = true;

                // Check if the current element is the minimum in its row
                for (int k = 0; k < cols; k++) {
                    if (currentElement > matrix[i][k]) {
                        isSaddlePoint = false;
                        break;
                    }
                }

                // Check if the current element is the maximum in its column
                for (int k = 0; k < rows; k++) {
                    if (currentElement < matrix[k][j]) {
                        isSaddlePoint = false;
                        break;
                    }
                }

                // If the current element is a saddle point, print its coordinates
                if (isSaddlePoint) {
                    System.out.println("Saddle Point found at (" + i + ", " + j + "): " + currentElement);
                }
            }
        }
    }
}