package yun.thread;

public class MusicPlayer extends Thread {
    int type;
    MusizBox musizBox;

    public MusicPlayer(int type, MusizBox musizBox) {
        this.type = type;
        this.musizBox = musizBox;
    }

    @Override
    public void run() {
        switch (type){
            case 1:
                musizBox.playMusicA();
                break;
            case 2:
                musizBox.playMusicB();
                break;
            case 3:
                musizBox.playMusicC();
                break;
        }
    }
}
