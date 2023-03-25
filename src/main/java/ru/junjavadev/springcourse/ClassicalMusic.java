package ru.junjavadev.springcourse;

public class ClassicalMusic implements Music {
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
