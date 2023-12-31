import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Anagram {

    private String word;

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> candidates) {
        List<String> validCandidates = new ArrayList<>();

        for(String candidate : candidates) {
            if(isAnagram(candidate)) {
                validCandidates.add(candidate);
            }
        }
        return validCandidates;
    }

    public boolean isAnagram(String candidate) {

        this.word = word.toLowerCase();
        candidate = candidate.toLowerCase();

        char[] wordChars = this.word.toCharArray();
        char[] candidateChars = candidate.toCharArray();
        Arrays.sort(wordChars);
        Arrays.sort(candidateChars);

        if (word.equals(candidate)) {
            return false;
        }
        return Arrays.equals(wordChars, candidateChars);
    }

}

class Main {
    public static void main(String[] args) {
        Anagram anagram = new Anagram("master");
        List<String> anagrams = anagram.match(List.of("streams", "pigeon", "maters"));
        System.out.println(anagrams);
    }
}