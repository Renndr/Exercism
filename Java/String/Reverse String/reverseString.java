class ReverseString {

    String reverse(String inputString) {
        StringBuilder builder = new StringBuilder(inputString);
        builder.reverse();
        return builder.toString();
    }

    public static void main(String[] args) {

        ReverseString reverse = new ReverseString();
        System.out.println(reverse.reverse("hola"));
    }

}

