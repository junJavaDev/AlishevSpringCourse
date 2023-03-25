package ru.junjavadev.springcourse;

public class RockMusic implements Music{

    public void doMyInit() {
        System.out.println("Rock init");
    }

    public void doMyDestroy() {
        System.out.println("Rock destroy");
    }
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
