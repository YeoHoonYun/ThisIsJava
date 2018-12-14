package yun.java.ch12_멀티스레드;

import java.awt.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-10
 * Github : https://github.com/YeoHoonYun
 */
public class BeepPrintExample1 {
    public static void main(String[] args){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i=0; i<5; i++){
            toolkit.beep();
            try{Thread.sleep(500);}catch(Exception e){}
        }

        for(int i =0; i<5; i++){
            System.out.println("띵");
            try{Thread.sleep(500);} catch(Exception e){}
        }
    }
}
