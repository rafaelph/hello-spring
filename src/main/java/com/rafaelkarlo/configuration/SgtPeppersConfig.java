package com.rafaelkarlo.configuration;

import com.rafaelkarlo.objects.CDPlayer;
import com.rafaelkarlo.objects.CompactDisc;
import com.rafaelkarlo.objects.MediaPlayer;
import com.rafaelkarlo.objects.SgtPeppers;
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
