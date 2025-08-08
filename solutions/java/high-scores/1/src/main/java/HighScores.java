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

}
