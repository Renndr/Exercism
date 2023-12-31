class RomanNumerals {

    private int number;
    private String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    RomanNumerals(int number) {
        this.number = number;
    }

    String getRomanNumeral() {
        String romanNumeral = "";
        int i = 0;

        for (int value : values) {
            while (number >= value) {
                romanNumeral += symbols[i];
                number -= value;
            }
            i++;
        }
        return romanNumeral;
    }
}

class Main {
    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals(15);
        System.out.println(romanNumerals.getRomanNumeral());
    }
}
