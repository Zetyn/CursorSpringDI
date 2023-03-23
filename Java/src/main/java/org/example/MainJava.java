package org.example;

import org.example.config.Config;
import org.example.players.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainJava {
    public static void main(String[] args) {
        System.out.println("\nJava config:\n");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.classicPlay();
        musicPlayer.rockPlay();
        context.close();
    }
}