class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{

    private int distance;
    private int victories;

    @Override
    public void drive() {
        distance += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    public int getNumberOfVictories() {
        return victories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        victories += numberOfVictories;
    }

    
    @Override
    public int compareTo(ProductionRemoteControlCar otherCar) {
        return Integer.compare(otherCar.victories, this.victories);
    }



    public static void main(String[] args) {
        ProductionRemoteControlCar car = new ProductionRemoteControlCar();
        car.drive();
        System.out.println(car.getDistanceTravelled());
    }

}