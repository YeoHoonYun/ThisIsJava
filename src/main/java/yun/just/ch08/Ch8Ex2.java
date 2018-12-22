package yun.just.ch08;

import javax.swing.*;
import java.awt.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-23
 * Github : https://github.com/YeoHoonYun
 */
public class Ch8Ex2 extends JFrame {
    public Ch8Ex2(){
        super("Hello World");
        getContentPane().setLayout(new FlowLayout());
        JLabel label = new JLabel("Welcome to Swing");
        getContentPane().add(label);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(200,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        Ch8Ex2 app =new Ch8Ex2();
    }
}
