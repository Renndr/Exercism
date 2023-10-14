public class Watcher {
    public static void main(String[] args) {
        
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        birdCount.hasDayWithoutBirds();
        birdCount.getCountForFirstDays(4);
        System.out.println(birdCount.getCountForFirstDays(2));

    }
}
