package yun.thread;

public class MusizBox {
    //모든 메소드에서 어떤 메소드가 먼저 실행되면 실행하는 결정권을 가지게 된다.wait()를 만나기 전에는 모니터링 락을 놓지않는다.
    public synchronized void playMusicA(){
        for(int i=0; i<10; i++){
            System.out.println("신나는 음악");
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void playMusicB(){
        for(int i=0; i<10; i++){
            System.out.println("슬픈 음악");
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public  void playMusicC(){
        for(int i=0; i<10; i++){
            synchronized (this) {
                System.out.println("카페 음악");
            }
            try {
                Thread.sleep((int) (Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
