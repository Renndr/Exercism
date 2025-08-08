class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.replaceAll("[ -]", "").toLowerCase();
        return (phrase.matches("^(?!.*(.).*\\1)[a-zA-Z -]*$"));
    }
}
