import java.util.List;

public class test {
    private int[][] matrix;

    // Constructor that takes a List of List of integers
    test(List<List<Integer>> values) {
        if (values == null || values.isEmpty() || values.get(0).isEmpty()) {
            // Handle invalid input, e.g., throw an exception or set a default matrix
            throw new IllegalArgumentException("Invalid input for matrix initialization");
        }

        int rows = values.size();
        int cols = values.get(0).size();

        // Initialize the matrix
        matrix = new int[rows][cols];

        // Fill the matrix with values from the List of List
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = values.get(i).get(j);
            }
        }
    }

    // Other methods for matrix operations could be added here

    public void printMatrix() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}