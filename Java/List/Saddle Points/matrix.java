import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;

class Matrix {

     private int[][] matrix;

    Matrix(List<List<Integer>> values) {
        this.matrix = new int[values.size()][values.get(0).size()];
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return null;
    }

}

class test{
    public static void main(String[] args) {
        System.out.println("a");
    }
}
