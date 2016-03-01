package com.rafaelkarlo.annotationconfig;

public class SgtPeppers implements CompactDisc {

    private static final String title = "Song of Sgt. Peppers";
    private static final String artist = "Sgt. Peppers";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);

    }
}
