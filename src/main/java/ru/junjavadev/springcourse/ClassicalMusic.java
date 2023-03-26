package ru.junjavadev.springcourse;

import org.springframework.stereotype.Component;
@Component
public class ClassicalMusic implements Music {
    ClassicalMusic (){}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Classical init");
    }

    public void doMyDestroy() {
        System.out.println("Classical destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
