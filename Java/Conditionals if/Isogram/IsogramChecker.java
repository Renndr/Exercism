class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("[ -]", "").toLowerCase();
        return (phrase.matches("^(?!.*(.).*\\1)[a-zA-Z -]*$"));
    }

    public static void main(String[] args) {
        IsogramChecker checker = new IsogramChecker();
        
        System.out.println(checker.isIsogram("Alphabet"));
    }

}
