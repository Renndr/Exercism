public class Hamming {
    private String leftStrand;
    private String rightStrand;

    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        
        if (leftStrand == "" && rightStrand != "") {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if (rightStrand == "" && leftStrand != "") {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if (leftStrand.length()  != rightStrand.length() ) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {

        int hammingDistance = 0;

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }

    public static void main(String[] args) {
        Hamming hamming =  new Hamming("", "");
        
        System.out.println(hamming.getHammingDistance());
    }
}
