package org.example.players;

public class MusicPlayer{
    private final ClassicMusicPlayer classicMusicPlayer;
    private final RockMusicPlayer rockMusicPlayer;

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
