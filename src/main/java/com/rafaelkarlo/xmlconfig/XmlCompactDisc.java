package com.rafaelkarlo.xmlconfig;

import com.rafaelkarlo.annotationconfig.CompactDisc;

public class XmlCompactDisc implements CompactDisc {

    private static final String title = "XML Rock";
    private static final String artist = "XML Artist";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);

    }
}
