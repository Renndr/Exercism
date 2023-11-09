public class PopCount {
    public int eggCount(int number) {
        return Integer.bitCount(number);
    }
}

class Main {
    public static void main(String[] args) {
        PopCount popCount = new PopCount();
        System.out.println(popCount.eggCount(999999999));
    }
}
