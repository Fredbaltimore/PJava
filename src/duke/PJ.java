package duke;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class PJ extends JFrame {
    PJ(){
        super("Rectangles and shit");

        JPanel j = new JPanel();
        JButton button = new JButton("Button");
        j.add(button);
        add(j);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        new PJ();
//        Rectangle rect = new Rectangle(44,55, 44,44);
//
//        int x;
//        int y;
//        int a;
//        String name;
//        boolean isAsshole;
//        x = 33;
//        y = x * 4;
//        a = y * x * 4;
//        int b = a / 2;
//
//
//
//        System.out.println(x +"\n"+ y +"\n"+ a+"\n"+ b);

    }


}
