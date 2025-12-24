package AdvancedJava;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame extends JFrame {
    JButton myButton = new JButton("MY Button");
    JButton myButton2 = new JButton("MY Button2");

    MyFrame(){

        myButton.setBounds(100,100,100,100);

        myButton.addActionListener(
                (e)-> System.out.println("u cliked the button")
        );

        myButton2.setBounds(100,200,100,100);

        myButton2.addActionListener(
                (e)-> System.out.println("u cliked the 2nd button")
        );

        /*
        myButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked a button");

            }
        });*/

        this.add(myButton);
        this.add(myButton2);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }

}
