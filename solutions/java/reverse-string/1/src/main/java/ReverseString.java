class ReverseString {

    String reverse(String inputString) {
        StringBuilder builder = new StringBuilder(inputString);
        builder.reverse();
        return builder.toString();
    }
}
