class Acronym {

    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
        get();
    }

    String get() {
        //phrase = phrase.replaceAll("[-]", "");
        String[] words = phrase.split("[\\s-_]+");
        String acronym = "";
        for (String word : words) {
            if(!word.isEmpty())
            acronym += word.charAt(0);
        }
        return acronym.toUpperCase();
    }

}