package ru.junjavadev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    public static void main(String[ ] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer player = new MusicPlayer(music);
        Music classicalMusic = context.getBean("classicalMusic", Music.class);
        Music popMusic = context.getBean("popMusic", Music.class);
        Music rockMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.setMusicList(List.of(classicalMusic, popMusic, rockMusic));
        musicPlayer.playMusicList();
        context.close();
    }
}
