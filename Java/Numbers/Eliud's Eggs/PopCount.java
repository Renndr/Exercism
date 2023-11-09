public class PopCount {
    public int eggCount(int number) {
        int count = 0;
        while(number > 0) {
            count += number % 2 == 1 ? 1 : 0;
            number /= 2;
            System.out.println(number);
        }
        return count;
    }
}

class Main {
    public static void main(String[] args) {
        PopCount popCount = new PopCount();
        System.out.println(popCount.eggCount(156));
    }
}

