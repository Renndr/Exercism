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

class Main {
    public static void main(String[] args) {
        Acronym acronym = new Acronym("The Road _Not_ Taken");
        String result = acronym.get();
        System.out.println(result);
    }
}