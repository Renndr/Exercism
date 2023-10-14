public class ExperimentalRemoteControlCar implements RemoteControlCar{

    private int distance;

    @Override
    public void drive() {
        distance += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distance;
    }

    public static void main(String[] args) {
        ExperimentalRemoteControlCar car = new ExperimentalRemoteControlCar();
        car.drive();
        car.drive();
        System.out.println(car.getDistanceTravelled());
    }
    
}
