import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> secretList = new LinkedList<>();

        if ((number & 1) == 1) {
            secretList.add(Signal.WINK);
        }
        if ((number & 2) == 2) {
            secretList.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 4) == 4) {
            secretList.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) == 8) {
            secretList.add(Signal.JUMP);
        }
        if ((number & 16) == 16) { 
            Collections.reverse(secretList);
        }

        return secretList;

    }
    
}