class Darts {
    int score(double xOfDart, double yOfDart) {
        double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
    
        if (distance <= 1) {
            // The dart lands in the inner circle
            return 10;
        } else if (distance <= 5) {
            // The dart lands in the middle circle
            return 5;
        } else if (distance <= 10) {
            // The dart lands in the outer circle
            return 1;
        } else {
            // The dart lands outside the target
            return 0;
        }
    }
}