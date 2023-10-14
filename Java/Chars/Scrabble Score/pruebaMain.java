public class pruebaMain {
    
    public static void main(String[] args) {
        String word = "cabbage";
        Scrabble scrabble = new Scrabble(word);
        System.out.println("Word: " + word);
        System.out.println("Score: " + scrabble.getScore());
    }
}
