package yun.thread;

public class ThreadA {
    public static void main(String[] args) {
        TreadB b = new TreadB();
        b.start();
        synchronized (b){
            try{
                System.out.println("b가 완료될때 까지 기다립니다. ");
                b.wait();
            }catch (Exception e){
                e.printStackTrace();
            }
            // b가 완료되어 Total까지 다 더하고 출력을 한다.
            System.out.println("Total is : " + b.total);
        }
    }
}
