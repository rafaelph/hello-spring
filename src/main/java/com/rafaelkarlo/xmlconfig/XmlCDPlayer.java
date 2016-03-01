package com.rafaelkarlo.xmlconfig;

import com.rafaelkarlo.annotationconfig.CompactDisc;
import com.rafaelkarlo.annotationconfig.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class XmlCDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public XmlCDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play() {
        this.compactDisc.play();
    }
}
