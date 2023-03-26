package ru.junjavadev.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[ ] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        // Music music = context.getBean("musicBean", Music.class);
        // MusicPlayer player = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer musicPlayer3 = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer1.playMusicList();
        musicPlayer2.playMusicList();
        musicPlayer3.playMusicList();
        context.close();
    }
}
