package model;

import java.util.List;

public class Taps {

    private List<Tap> taps;

    public List<Tap> getTaps() {
        return taps;
    }


    public void setTaps(List<Tap> taps) {
        this.taps = taps;
    }

    public Taps(List<Tap> taps) {
        this.taps = taps;
    }

    public Taps() {

    }
}
