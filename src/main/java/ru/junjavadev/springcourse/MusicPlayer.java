package ru.junjavadev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

@Component
public class MusicPlayer {
    private Music classicalMusic;
    private Music rockMusic;

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic,
                       @Qualifier("classicalMusic") Music classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public String playMusic(Genre genre) {
        String[] songs =
            switch (genre)  {
            case ROCK -> rockMusic.getSongs();
            case CLASSICAL -> classicalMusic.getSongs();
        };
        return songs[ThreadLocalRandom.current().nextInt(songs.length)];
    }
}
