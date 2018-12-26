package yun.thread;

public class MusicBoxExam {
    public static void main(String[] args) {

        //쓰레드와 공유객체
        MusizBox box = new MusizBox();
        MusicPlayer kang = new MusicPlayer(1, box);
        MusicPlayer kim = new MusicPlayer(2, box);
        MusicPlayer lee = new MusicPlayer(3, box);

        kang.start();
        kim.start();
        lee.start();
    }
}
