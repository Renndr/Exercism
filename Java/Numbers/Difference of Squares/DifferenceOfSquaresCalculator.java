class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow((input * (input + 1) / 2), 2);
    }

    int computeSumOfSquaresTo(int input) {
        int value = 0;

        for(int i = 0; i <= input; i++) {
            value += Math.pow(i, 2);
        }

        return value;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}

class test {
    public static void main(String[] args) {
        DifferenceOfSquaresCalculator d = new DifferenceOfSquaresCalculator();
        System.out.println(d.computeDifferenceOfSquares(10));
    }
}