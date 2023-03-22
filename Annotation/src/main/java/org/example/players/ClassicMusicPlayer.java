package org.example.players;

import org.example.models.Song;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusicPlayer implements Player{
    private List<Song> songs;

    public ClassicMusicPlayer(List<Song> songs) {
        this.songs = songs;
    }


    @PostConstruct
    public void init() {
        this.songs = new ArrayList<>();
        Song song1 = new Song("The magic flute","Mozart");
        Song song2 = new Song("Fidelio","Beethoven");
        songs.add(song1);
        songs.add(song2);
    }
    @Override
    public void play() {
        System.out.println("Сlassical music is playing...\n");
        for (Song song:songs) {
            System.out.println("Title: " + song.getTitle() + "\nAuthor:" + song.getAuthor());
        }
    }
}
