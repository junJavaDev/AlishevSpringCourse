package ru.junjavadev.springcourse;

import org.springframework.stereotype.Component;

import java.util.random.RandomGenerator;

@Component
public class ClassicalMusic implements Music {

    private final String[] songs = {
            "Вивальди – Времена Года ",
            "Бетховен – Ода К Радости",
            "Бах – Sonata #4 In C Minor (Adagio)",
            "Боккерини - Менуэт"
    };

    @Override
    public String[] getSongs() {
        return songs;
    }
}
