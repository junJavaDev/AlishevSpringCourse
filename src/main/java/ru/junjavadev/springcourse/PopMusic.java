package ru.junjavadev.springcourse;

import org.springframework.stereotype.Component;

//@Component
public class PopMusic implements Music {
    public void doMyInit() {
        System.out.println("Pop init");
    }

    public void doMyDestroy() {
        System.out.println("Pop destroy");
    }
    @Override
    public String getSong() {
        return "Я люблю тебя до слёз";
    }
}
