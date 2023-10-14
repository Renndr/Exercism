import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HighScores {

    private List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = highScores;
    }

    List<Integer> scores() {
        return scores;
    }

    Integer latest() {
        return scores.get(scores.size() -1);
    }

    Integer personalBest() {
        return Collections.max(scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> mutableList = new ArrayList<>(scores);
        Collections.sort(mutableList, Collections.reverseOrder());
        
        if (mutableList.size() <= 3) {
            return mutableList;
        } else {
            return mutableList.subList(0, 3);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20);
        HighScores scores = new HighScores(numbers);
        System.out.println(scores.personalTopThree());
        
        /*List<Integer> immutableList = List.of(10, 20, 30, 40, 50, 60, 70, 80);
        
        List<Integer> mutableList = new ArrayList<>(immutableList);
        Collections.sort(mutableList, Collections.reverseOrder());
        
        List<Integer> topThreeNumbers = mutableList.subList(0, 3);

        System.out.println(topThreeNumbers);*/
    }


}