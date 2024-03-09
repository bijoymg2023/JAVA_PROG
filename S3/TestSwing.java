

import javax.swing.*;
import java.awt.*;


class TestSwing extends JFrame{
    TestSwing(){
        JFrame lable_f = new JFrame("Welcome to SWing");
        JLabel l1 = new JLabel("Swing is difficult");
        l1.setBounds(50,50,200,30);
        JLabel l2 = new JLabel("U fucked");
        l2.setBounds(50,50,200,30);
        lable_f.add(l1);  
        lable_f.add(l2);
        lable_f.setSize(400,400);
        lable_f.setLayout(new FlowLayout());
        lable_f.setVisible(true);
    }
    public static void main(String args[]){
         new TestSwing();
    }
}