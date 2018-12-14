package yun.java.ch04_조건문과반복문;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class SwitchExam {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) + 1;

        switch(num){
            case 1:
                System.out.println("1번이 나왔습니다.");
                break;
            case 2:
                System.out.println("2번이 나왔습니다.");
                break;
            case 3:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 4:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 5:
                System.out.println(num+"번이 나왔습니다.");
                break;
            case 6:
                System.out.println(num+"번이 나왔습니다.");
                break;

        }
    }
}
