package org.example.players;

import jakarta.annotation.PostConstruct;
import org.example.models.Song;

import java.util.ArrayList;
import java.util.List;

public class RockMusicPlayer implements Player{
    private List<Song> songs;

    public RockMusicPlayer(List<Song> songs) {
        this.songs = songs;
    }

    public RockMusicPlayer() {

    }

    @PostConstruct
    public void init() {
        this.songs = new ArrayList<>();
        Song song1 = new Song("Smells Like Teen Spirit","Nirvana");
        Song song2 = new Song("Nothing Else Matters","Metallica");
        songs.add(song1);
        songs.add(song2);
    }
    @Override
    public void play() {
        System.out.println("Rock music is playing...\n");
        for (Song song:songs) {
            System.out.println("Title: " + song.getTitle() + "\nAuthor:" + song.getAuthor());
        }
    }
}
