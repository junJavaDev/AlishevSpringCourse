package ru.junjavadev.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Computer init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Computer destroyed");
    }
    @Override
    public String toString() {
        return "Computer " +
                "id=" + id + "\n" + musicPlayer.playMusic();
    }
}
