package ru.zhukov.springcourse;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Initializing ClassicalMusic");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroying ClassicalMusic");
    }
    @Override
    public String getSong() {
        return "Some Classic Song";
    }
}
