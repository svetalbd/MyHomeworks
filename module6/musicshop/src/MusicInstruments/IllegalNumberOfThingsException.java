package MusicInstruments;

import static java.lang.System.*;

/**
 * Created by Сергей on 18.03.2016.
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
