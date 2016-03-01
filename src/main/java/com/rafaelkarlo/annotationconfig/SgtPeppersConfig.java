package com.rafaelkarlo.annotationconfig;

import com.rafaelkarlo.annotationconfig.CDPlayer;
import com.rafaelkarlo.annotationconfig.CompactDisc;
import com.rafaelkarlo.annotationconfig.MediaPlayer;
import com.rafaelkarlo.annotationconfig.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SgtPeppersConfig {

    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }

    @Bean
    public MediaPlayer mediaPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}
