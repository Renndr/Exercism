public class Lasagna {

    // TODO: define the 'expectedMinutesInOven()' method  
    public int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
        public int remainingMinutesInOven(int x) {
        return expectedMinutesInOven() - x;
    }
    
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes (int layers) {
        return layers*2;
    }
    
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers)+minutes;
    }
    
    public static void main(String[] args) {
        
        Lasagna lasagna = new Lasagna();
        
        System.out.println(lasagna.totalTimeInMinutes(3, 20));
    }
    
}


       
