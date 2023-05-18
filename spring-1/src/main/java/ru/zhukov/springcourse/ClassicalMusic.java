package ru.zhukov.springcourse;

public class ClassicalMusic implements Music {

    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Initializing ClassicalMusic");
    }

    public void doMyDestroy() {
        System.out.println("Destroying ClassicalMusic");
    }
    @Override
    public String getSong() {
        return "Some Classic Song";
    }
}
