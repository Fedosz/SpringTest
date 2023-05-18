package ru.zhukov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Some rock song";
    }
}
