package ru.junjavadev.springcourse;

import org.springframework.stereotype.Component;

import java.util.random.RandomGenerator;

@Component
public class RockMusic implements Music{
    private final String[] songs = {
            "Сплин - Выхода нет",
            "Кино - В наших глазах",
            "7Б - Молодые ветра",
            "Lumen - Гореть"
    };

    public String[] getSongs() {
        return songs;
    }

}
