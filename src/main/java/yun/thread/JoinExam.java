package yun.thread;

public class JoinExam {
    public static void main(String[] args) {
        MyTread5 myTread5 = new MyTread5();
        myTread5.start();

        System.out.println("시작");

        // join 메인 쓰레드는 해당 쓰레드가 끝날때까지 기다린다.
        try {
            myTread5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("종료!");
    }
}
