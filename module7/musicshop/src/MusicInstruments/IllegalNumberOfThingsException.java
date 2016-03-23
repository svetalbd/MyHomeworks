package MusicInstruments;

import static java.lang.System.*;

/**
 * Created by Mykhailenko Svutlana on 23/03/2016.
 */
public class IllegalNumberOfThingsException extends IllegalStateException {
    private int number;

    public int getNumber() {
        return number;
    }

    public IllegalNumberOfThingsException(String message, int num){

        super(message);
        number=num;
    }
}
