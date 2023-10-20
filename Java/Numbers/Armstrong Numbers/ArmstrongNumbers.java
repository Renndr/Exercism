class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int number = numberToCheck;
        int sum = 0;
        int length = String.valueOf(number).length();

        for(int i = 0; i < length; i++) {
            int digit = number % 10;
            sum += Math.pow(digit, length);
            number /= 10;
        }
        return sum == numberToCheck;
    }

}

class test {
    public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();
        System.out.println(armstrongNumbers.isArmstrongNumber(153));
        System.out.println(armstrongNumbers.isArmstrongNumber(10));
    }
}