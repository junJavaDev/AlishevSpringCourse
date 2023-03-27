package ru.junjavadev.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.random.RandomGenerator;

public class RockMusic implements Music{
    private final String[] songs = {
            "Сплин - Выхода нет",
            "Кино - В наших глазах",
            "7Б - Молодые ветра",
            "Lumen - Гореть"
    };

    @PostConstruct
    public void doMyInit() {
        System.out.println("Rock init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Rock destroyed");
    }

    public String[] getSongs() {
        return songs;
    }

}
