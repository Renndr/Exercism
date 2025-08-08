public class Say {

    private final String[] OneDigit = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private final String[] TeenDigits = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen","seventeen", "eighteen", "nineteen"};
    private final String[] TwoDigit = {"twenty", "thirty", "forty", "fifty", "sixty", "seventy","eighty", "ninety"};

    public String say(long number) {
        if(number < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        if(number <= 9) {
            return sayOneDigit(number);
        }
        if(number >= 10 && number <= 19) {
            return sayTeenDigits(number);
        }
        if(number >= 20 && number <= 99) {
            return sayTwoDigit(number);
        }
        if(number >= 100 && number <= 999) {
            return sayThreeDigit(number);
        }
        if(number >= 1000 && number <= 999999) {
            if(number % 1000 == 0)
                return say(number / 1000) + " thousand";
            return say(number / 1000) + " thousand " + say(number % 1000);
        }
        if(number >= (long) 1e6 && number <= 999999999) {
            if(number % (long) 1e6 == 0)
                return say(number / (long) 1e6) + " million";
            return say(number / (long) 1e6) + " million " + say(number % (long) 1e6);
        }
        if(number >= (long) 1e9 && number <= 999999999999L) {
            if(number % (long) 1e9 == 0)
                return say(number / (long) 1e9) + " billion";
            return say(number / (long) 1e9) + " billion " + say(number % (long) 1e9);
        }
        else {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999.");
        }
    }

    private String sayOneDigit(long number) {
        return OneDigit[(int) number];
    }

    private String sayTeenDigits(long number) {
        return TeenDigits[(int) number - 10];
    }

    private String sayTwoDigit(long number) {
        String result = "";
        if(number % 10 == 0) {
            return TwoDigit[(int) number / 10 - 2];
        }
        result += TwoDigit[(int) number / 10 - 2] + "-" + OneDigit[(int) number % 10];
        return result;
    }

    private String sayThreeDigit(long number) {
        String result = "";
        if(number % 100 == 0) {
            return OneDigit[(int) number / 100] + " hundred";
        }
        result += say(number / 100) +" hundred " + say(number % 100) ;
        return result;
    }

}