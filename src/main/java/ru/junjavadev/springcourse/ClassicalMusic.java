package ru.junjavadev.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit() {
        System.out.println("Classical init");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Classical destroyed");
    }

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
