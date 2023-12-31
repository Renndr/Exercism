public class PangramChecker {

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {

        char[] alphabet = this.alphabet.toCharArray();

        for(char letter : alphabet) {
            if(input.toLowerCase().indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

}

class Main {
    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog"));
    }
}