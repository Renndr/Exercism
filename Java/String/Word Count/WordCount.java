import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class WordCount {

    public Map<String,Integer> phrase(String input) {

        return Arrays.stream(input
            .toLowerCase()
            .replaceAll("[^a-z0-9' ]", " ")
            .trim()
            .split("\\s+"))
            .map(it -> it.replaceAll("^'|'$", ""))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet().stream()
            .collect(Collectors.toMap(Map.Entry::getKey, it -> it.getValue().intValue()));
    }

    public static void main(String[] args) {
        WordCount wordCount = new WordCount();
        wordCount.phrase("That's the password: 'PASSWORD 123'!, cried the Special Agent. So I fled.");

        System.out.println(wordCount.phrase("That's the password: 'PASSWORD 123'!, cried the Special Agent. So I fled."));
    }

}