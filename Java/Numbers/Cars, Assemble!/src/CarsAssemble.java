public class CarsAssemble {
    
    private double car = 221;
    private double carPerMinutes = car/60;

    public double productionRatePerHour(int speed) {

        if(speed >= 0 && speed <=4) {
            return speed * car;
       }
        else if (speed >= 5 && speed <= 8) {
            return (speed*car) / 100 * 90;
       } 
        else if (speed == 9) {
            return (speed*car) / 100 * 80;
       }
        else if (speed == 10) {
            return (speed*car) / 100 * 77;
        } else {
            throw new IllegalArgumentException ("Given speed is lower than 0 or greater than 10");
        }
    }

    public int workingItemsPerMinute(int speed) {
       
        if(speed >= 0 && speed <=4) {
            double suma = (speed * carPerMinutes);
            return (int)suma;
       }
        else if (speed >= 5 && speed <= 8) {
            double suma = (speed * carPerMinutes)/100 * 90;
            return (int)suma;
       } 
        else if (speed == 9) {
            double suma = (speed * carPerMinutes)/100 * 80;
            return (int)suma;
        }
        else if (speed == 10) {
            double suma = (speed * carPerMinutes)/100 * 77;
            return (int)suma;
        } else {
            throw new IllegalArgumentException ("Given speed is lower than 0 or greater than 10");
    }
    }
}
