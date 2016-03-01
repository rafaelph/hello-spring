package com.rafaelkarlo.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class ProfileConfig {

    @Bean
    @Profile("dev")
    public ProfileBean compactDisc() {
        return new DevProfileBean();
    }

    @Bean
    @Profile("prod")
    public ProfileBean prodCompactDisc() {
        return new ProdProfileBean();
    }

}
