package org.example.config;

import org.example.models.Song;
import org.example.players.ClassicMusicPlayer;
import org.example.players.MusicPlayer;
import org.example.players.RockMusicPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {
    @Bean
    public RockMusicPlayer rockMusicPlayer() {
        List<Song> songs = new ArrayList<>();
        Song song1 = new Song("Smells Like Teen Spirit","Nirvana");
        Song song2 = new Song("Nothing Else Matters","Metallica");
        songs.add(song1);
        songs.add(song2);
        return new RockMusicPlayer(songs);
    }
    @Bean
    public ClassicMusicPlayer classicMusicPlayer() {
        List<Song> songs = new ArrayList<>();
        Song song1 = new Song("The magic flute","Mozart");
        Song song2 = new Song("Fidelio","Beethoven");
        songs.add(song1);
        songs.add(song2);
        return new ClassicMusicPlayer(songs);
    }

    @Bean
    public MusicPlayer musicPlayer(ClassicMusicPlayer classicMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        return new MusicPlayer(classicMusicPlayer, rockMusicPlayer);
    }
}
