package org.example;

import org.example.players.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainXML {
    public static void main(String[] args) {
        System.out.println("\nXml config:\n");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);
        musicPlayer.classicPlay();
        musicPlayer.rockPlay();
        context.close();
    }
}