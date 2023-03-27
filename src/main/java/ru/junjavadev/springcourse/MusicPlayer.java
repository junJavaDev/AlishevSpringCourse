package ru.junjavadev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")

    public String getName() {
        return name;
    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("MusicPlayer init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("MusicPlayer destroyed");
    }

    private List<Music> musicList;
    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        String[] songs = musicList.get(ThreadLocalRandom.current().nextInt(musicList.size())).getSongs();
        return songs[ThreadLocalRandom.current().nextInt(songs.length)];
    }
}
