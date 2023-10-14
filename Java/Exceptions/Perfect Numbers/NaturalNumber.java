class NaturalNumber {

    private int number;

    NaturalNumber(int number) {
        if(number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        } 
        this.number = number;
    }

    Classification getClassification() {

        if(getFactors(number) == number) {
            return Classification.PERFECT;
        } 
        if(getFactors(number) > number) {
            return Classification.ABUNDANT;
        } else {
            return Classification.DEFICIENT;
        }
    }

    public int getFactors(int number) {

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

class test {
    public static void main(String[] args) {
        NaturalNumber naturalNumber = new NaturalNumber(0);
        System.out.println(naturalNumber.getClassification());
        //System.out.println(naturalNumber.getFactors(6));
    }
}