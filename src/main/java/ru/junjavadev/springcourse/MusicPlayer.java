package ru.junjavadev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private String name;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private List<Music> musicList = new ArrayList<>();

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    public MusicPlayer() {}
    public void doMyInit() {
        System.out.println("MusicPlayer init");
    }

    public void doMyDestroy() {
        System.out.println("MusicPlayer destroy");
    }
    public void playMusicList() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

    public String playMusic() {
        return "Playing: " + classicalMusic.getSong() + "\nPlaying: "+ rockMusic.getSong();
    }
}
