public class Blackjack {

    public static int parseCard(String card) {
         
         switch (card) {
             case "ace":
                 return 11;
             case "two":
                 return 2;
             case "three":
                 return 3; 
             case "four":
                 return 4; 
             case "five":
                 return 5;
             case "six":
                 return 6;
             case "seven":
                 return 7;
             case "eight":
                 return 8;
             case "nine":
                 return 9;
             case "ten":
             case "jack":
             case "queen":
             case "king":
                 return 10;     
             default:
                 return 0;   
         }
     }
 
     public static boolean isBlackjack(String card1, String card2) {
        if (parseCard(card1) + parseCard(card2) == 21) {
             return true;
        } else {
             return false;
         }
     }
 
     public String largeHand(boolean isBlackjack, int dealerScore) {
         if (isBlackjack && dealerScore < 10) {
             return "W";
         } if (!isBlackjack){
             return "P";
         } else {
             return "S";
         }
         
     }
 
     public static String smallHand(int handScore, int dealerScore) {
        
         if (handScore >=17 && handScore <=21|| handScore >=12 && handScore <=16 && dealerScore <=6) {
             return "S";
         } if (handScore <=11 || handScore >=12 && handScore <=16 && dealerScore >=7) {
             return "H";
         } else {
             return "L";
         }
         
     }
 
     public String firstTurn(String card1, String card2, String dealerCard) {
         int handScore = parseCard(card1) + parseCard(card2);
         int dealerScore = parseCard(dealerCard);
 
         if (20 < handScore) {
             return largeHand(isBlackjack(card1, card2), dealerScore);
         } else {
             return smallHand(handScore, dealerScore);
         }
     }
}
