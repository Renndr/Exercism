public class ElonsToyCar {

    private int meter = 0;
    private String meters = "Driven " + meter + " meters";
    private int percentaje = 100;
    private String battery = "Battery at " + percentaje + "%";
    

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return meters;
    }

    public String batteryDisplay() {
        if(percentaje < 1) {
            return "Battery empty";
        }
        else {
            return battery;
        }
    }

    public void drive() {
        meter += 20;
        
        if (meter > 2000) {
            meter = 2000;
        }
        meters = "Driven " + meter + " meters";
        
        percentaje -= 1;
        battery = "Battery at " + percentaje + "%";
    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        car.drive();
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        
    }
}

