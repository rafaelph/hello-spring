package com.rafaelkarlo.annotationconfig;

import org.springframework.stereotype.Component;

@Component
public class Metallica implements CompactDisc {

    private final String title = "One";
    private final String artist = "Metallica";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
