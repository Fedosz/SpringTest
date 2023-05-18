package ru.zhukov.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        Music music = context.getBean("classicalMusic", Music.class);
        Music music2 = context.getBean("rockMusic", Music.class);
        System.out.println(music.getSong());
        System.out.println(music2.getSong());

        context.close();
    }
}
