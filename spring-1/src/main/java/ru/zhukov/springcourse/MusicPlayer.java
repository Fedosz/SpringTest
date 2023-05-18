package ru.zhukov.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic music;

    @Autowired
    public MusicPlayer(ClassicalMusic music) {
        this.music = music;
    }
    public String playMusic() {
        return "Playing " + music.getSong();
    }

}
