package org.example.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer{
    @Autowired
    private ClassicMusicPlayer classicMusicPlayer;
    @Autowired
    private RockMusicPlayer rockMusicPlayer;

    public MusicPlayer(ClassicMusicPlayer classicMusicPlayer, RockMusicPlayer rockMusicPlayer) {
        this.classicMusicPlayer = classicMusicPlayer;
        this.rockMusicPlayer = rockMusicPlayer;
    }

    public void classicPlay() {
        classicMusicPlayer.play();
    }
    public void rockPlay() {
        rockMusicPlayer.play();
    }
}
