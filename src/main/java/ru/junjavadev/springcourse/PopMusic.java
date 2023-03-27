package ru.junjavadev.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PopMusic implements Music{
    private final String[] songs = {
            "Киркоров",
            "Пугачева",
    };

    @PostConstruct
    public void doMyInit() {
        System.out.println("Pop init");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Pop destroyed");
    }

    public String[] getSongs() {
        return songs;
    }

}
