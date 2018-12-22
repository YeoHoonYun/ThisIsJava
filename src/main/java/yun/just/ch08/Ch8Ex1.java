package yun.just.ch08;

import java.awt.*;

/**
 * Created by cjswo9207u@gmail.com on 2018-12-23
 * Github : https://github.com/YeoHoonYun
 */
public class Ch8Ex1 {
    public static void main(String[] args) {
        Frame f = new Frame("Hello World");
        f.setLayout(new FlowLayout());
        Label label = new Label("Welcom to AWT");
        f.add(label);
        f.setSize(200,200);
        f.setVisible(true);
    }
}
