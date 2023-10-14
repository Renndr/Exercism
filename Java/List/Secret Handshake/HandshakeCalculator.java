import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        List<Signal> secret = new LinkedList<>();

        if ((number & 1) == 1) {
            secret.add(Signal.WINK);
        }
        if ((number & 2) == 2) {
            secret.add(Signal.DOUBLE_BLINK);
        }
        if ((number & 4) == 4) {
            secret.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) == 8) {
            secret.add(Signal.JUMP);
        }
        if ((number & 16) == 16) {
            Collections.reverse(secret);
        }

        return secret;

    }

    public static void main(String[] args) {
        HandshakeCalculator calculator = new HandshakeCalculator();
        System.out.println(calculator.calculateHandshake(8));
    }
}

