package yun.java.ch05_참조타입;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-14
 * Github : https://github.com/YeoHoonYun
 */
public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("프고르맹 사용법");
            System.out.println("java MainStringArrayArgument num1 num2");
            System.exit(0);
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }
}
