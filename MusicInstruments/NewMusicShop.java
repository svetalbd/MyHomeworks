package MusicInstruments;

import java.util.List;

/**
 * Created by Сергей on 06.03.2016.
 */
public class NewMusicShop {
    private List<Trumpet> trumpets;
    private List<Piano> pianos;
    private List<Guitar> guitars;

    public List<Trumpet> getTrumpets() {
        return trumpets;
    }

    public void setTrumpets(List<Trumpet> trumpets) {
        this.trumpets = trumpets;
    }

    public List<Piano> getPianos() {
        return pianos;
    }

    public void setPianos(List<Piano> pianos) {
        this.pianos = pianos;
    }

    public List<Guitar> getGuitars() {
        return guitars;
    }

    public void setGuitars(List<Guitar> guitars) {
        this.guitars = guitars;
    }
}
