import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final static List<String> languages = new ArrayList<>();
    
    public boolean isEmpty() {
        if (languages.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.get(0);
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        if (languages.contains(language)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isExciting() {
        return this.containsLanguage("Java") || this.containsLanguage("Kotlin");
    }
}
