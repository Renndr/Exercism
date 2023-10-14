class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        try {
            switch (operation) {
                case "+":
                    return format(operand1, operand2, operation, String.valueOf(operand1 + operand2));
                case "*":
                    return format(operand1, operand2, operation, String.valueOf(operand1 * operand2));
                case "/":
                    return format(operand1, operand2, operation, String.valueOf(operand1 / operand2));
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }

        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

    public String format(int value1, int value2, String operation, String result) {
        return value1 +" " + operation + " "+ value2 + " = " + result;
    }
}

class test {
    public static void main(String[] args) {
        CalculatorConundrum calculator = new CalculatorConundrum();
        System.out.println((calculator.calculate(72, 9, null)));
    }
}