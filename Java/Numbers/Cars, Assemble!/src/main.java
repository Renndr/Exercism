public class main {
    
    public static void main(String[] args) {
        CarsAssemble car = new CarsAssemble();
        car.productionRatePerHour(5);
        System.out.println(car.workingItemsPerMinute(0));
    }
}
