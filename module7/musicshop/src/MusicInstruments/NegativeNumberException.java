package MusicInstruments;


/**
 * Created by Mykhailenko Svutlana on 23/03/2016.
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
