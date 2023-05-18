package ru.zhukov.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music> music = new ArrayList<>();
    private String name;
    private int volume;
    public MusicPlayer(List<Music> music) {
        this.music = music;
    }
    public MusicPlayer() {}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void playMusic() {
        for (Music song: music) {
            System.out.println("Playing: " + song.getSong());
        }
    }

}
