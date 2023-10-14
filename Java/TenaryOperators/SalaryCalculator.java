public class SalaryCalculator {

    
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped < 6) ? 1.0 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold < 21) ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return productsSold * multiplierPerProductsSold(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double deduct = multiplierPerDaysSkipped(daysSkipped);
        double result = (1000 * deduct) + (multiplierPerProductsSold(productsSold) * productsSold);

        return (result < 2000) ? result : 2000;
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        System.out.println(salaryCalculator.finalSalary(2, 3));
    }
}