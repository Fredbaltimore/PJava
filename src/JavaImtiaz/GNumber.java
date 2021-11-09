package JavaImtiaz;

import javax.swing.*;
import java.awt.*;


public class GNumber extends JFrame {
    int counter = 0;
    GNumber(){
        super("Guess the number");
        int random = (int) (Math.random() * 50);

        System.out.println(random);
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JLabel label = new JLabel("Guessing game, enter number between 1 and 50 below");

        JButton button = new JButton("Enter");
        JTextField tf = new JTextField(15);

        panelOne.add(tf);
        panelTwo.add(button);
        add(panelOne, BorderLayout.CENTER);
        add(panelTwo, BorderLayout.SOUTH);
        add(label, BorderLayout.NORTH);
        button.addActionListener(ae -> {

              if(Integer.parseInt(tf.getText()) == random){
                  counter++;
                  String times = "times";
                  if (counter == 1){
                      times = "time";
                  }
                  JOptionPane.showMessageDialog(null, "You guessed the correct answer. It took you "
                          + +counter+ " " +times);
                  dispose();
              }else if (Integer.parseInt(tf.getText()) < random){
                  JOptionPane.showMessageDialog(null,"Too low, try again");
                  tf.setText("");
                  counter++;
              }else if (Integer.parseInt(tf.getText()) > random){
                  JOptionPane.showMessageDialog(null,"Too low, try again");
                  tf.setText("");
                  counter++;
              }
        });
        pack();
        setVisible(true);
    };

    public static void main(String[] args) {
        new GNumber();
    }
}
