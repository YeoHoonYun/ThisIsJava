package yun.thread;

public class Tread2Exam {
    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2("*");
        MyThread2 t2 = new MyThread2("-");


        // Runnable 인터페이스는 start() 메소드를 할수 없으므로, Thread 클래스 생성자에 넣어서 start 메서드를 호출한다.
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread1.start();
        thread2.start();
    }
}
