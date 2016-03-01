package com.rafaelkarlo.main;

import com.rafaelkarlo.annotationconfig.CDPlayerConfig;
import com.rafaelkarlo.profiles.ProfileConfig;
import com.rafaelkarlo.annotationconfig.MediaPlayer;
import com.rafaelkarlo.profiles.ProfileBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext contextWithXMLConfiguration = new ClassPathXmlApplicationContext("springconfig.xml");
        MediaPlayer mediaPlayer = (MediaPlayer) contextWithXMLConfiguration.getBean("cdPlayer");
        mediaPlayer.play();

        ApplicationContext contextWithAnnotatedConfiguration = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        mediaPlayer = contextWithAnnotatedConfiguration.getBean(MediaPlayer.class);
        mediaPlayer.play();

        //Should run with spring.profiles.active already set to an existing profile
        ApplicationContext profileContext = new AnnotationConfigApplicationContext(ProfileConfig.class);
        System.out.println(profileContext.getEnvironment());
        ProfileBean profileBean = profileContext.getBean(ProfileBean.class);
        profileBean.execute();
    }
}
