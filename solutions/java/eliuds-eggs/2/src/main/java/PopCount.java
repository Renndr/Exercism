public class PopCount {
    public int eggCount(int number) {
        int count = 0;
        while(number > 0) {
            count += number % 2 == 1 ? 1 : 0;
            number /= 2;
        }
        return count;
    }
}
