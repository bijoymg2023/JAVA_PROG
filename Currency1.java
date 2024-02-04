import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Currency1 extends JFrame implements ActionListener {
    JLabel l1, l2;
    JButton b1, b2;
    JTextField t1, t2;

    Currency1()
    {
        l1=new JLabel("DOLLARS");
        l2=new JLabel("DINAR");
        b1=new JButton("CONVERT");
        b2=new JButton("CLEAR");
        t1=new JTextField(20);
        t2=new JTextField(20);
        l1.setBounds(30,50,100,50);
        l2.setBounds(30,100,100,50);
        t1.setBounds(150,50,150,50);
        t2.setBounds(150,100,150,50);
        b1.setBounds(50,250,100,100);
        b2.setBounds(170,250,100,100);
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(l1);
        add(l2);
        setLayout(null);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("CURRENCY CONVERTER");
        setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addActionListener(this);
        t2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(t1.getText().length()==0)
            {
                String s= t2.getText();
                double a=Double.parseDouble(s);
                t1.setText((a/3)+"");
            }
            else
            {
                String s= t1.getText();
                double a=Double.parseDouble(s);
                t2.setText((a*3)+"");
            }
        }
        if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");

        }
        if(e.getSource()==t1)
        {
            String s= t1.getText();
            double a=Double.parseDouble(s);
            t2.setText((a*3)+"");
        }
        if(e.getSource()==t2)
        {
            String s= t2.getText();
            double a=Double.parseDouble(s);
            t1.setText((a/3)+"");
        }
       
    }
    public static void main(String args[])
    {
        new Currency1();
    }
}