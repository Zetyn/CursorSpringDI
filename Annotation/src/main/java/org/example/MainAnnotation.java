package org.example;

import org.example.players.MusicPlayer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MainAnnotation {
    public static void main(String[] args) {
        System.out.println("\nAnnotation config:\n");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainAnnotation.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.classicPlay();
        musicPlayer.rockPlay();
        context.close();
    }
}