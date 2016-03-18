package MusicInstruments;


/**
 * Created by Сергей on 18.03.2016.
 */


public class NegativeNumberException extends IllegalArgumentException {
    private int number;

    public int getNumber() {
        return number;
    }

    public NegativeNumberException(int num, String message) {
        super (message);
        number=num;
    }
}
