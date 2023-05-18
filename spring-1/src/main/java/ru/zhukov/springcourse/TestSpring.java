package ru.zhukov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        /*MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = musicPlayer == musicPlayer1;
        System.out.println(comparison);

        System.out.println(musicPlayer);
        System.out.println(musicPlayer1);*/

        //musicPlayer.playMusic();

        //System.out.println(musicPlayer.getVolume());
        //System.out.println(musicPlayer.getName());

        context.close();
    }
}
