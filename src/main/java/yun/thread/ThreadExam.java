package yun.thread;

public class ThreadExam {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        // start() 쓰레드가 실행을 준비를 하는 메서드
        t1.start();
        t2.start();

        System.out.println("main end !!!");

    }
}
