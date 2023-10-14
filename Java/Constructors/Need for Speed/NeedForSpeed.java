class NeedForSpeed {

    private int speed;
    private int batteryDrained;
    private int drivenDistance;
    private int batteryDrain;
    
    public NeedForSpeed(int speed, int batteryDrained) {
        this.speed = speed;
        this.batteryDrained = batteryDrained;
    }

    public boolean batteryDrained() {
        return batteryDrain >= 100;
    }


    public int distanceDriven() {
        return drivenDistance;
    }

    public int battery() {
        return batteryDrain;
    }

    public void drive() {
        if (!batteryDrained()) {
            drivenDistance += speed;
            batteryDrain += batteryDrained;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {

    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }
    
    public boolean tryFinishTrack(NeedForSpeed car) {

        var battery = car.battery();

        while (car.distanceDriven() < distance && !car.batteryDrained()) {
            car.drive();
        }

        return car.distanceDriven() >= distance && battery < 100;
    }

    public static void main(String[] args) {
        NeedForSpeed car = new NeedForSpeed(2, 1);
        //System.out.println(!car.batteryDrained());
        RaceTrack race = new RaceTrack(20);

        System.out.println(race.tryFinishTrack(car)); 
        System.out.println(car.battery());
    }
}