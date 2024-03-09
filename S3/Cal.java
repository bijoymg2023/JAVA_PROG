import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
 class Cal{
    private JButton num0;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num7;
    private JButton num8;
    private JButton num9;
    
    private JButton badd;
    private JButton bsub;
    private JButton bmul;
    private JButton bdiv;
    private JButton beq;
    private JButton bclr;
    private JButton bdel;
    private JButton bdec;


    private TextField tf;
    
    
    Cal(){
        JFrame jft = new JFrame("CALCULATOR");
        jft.setVisible(true);
        jft.setSize(640,380);
        tf = new TextField();

        num0 = new JButton("0");
        num1 = new JButton("1");
        num2 = new JButton("2");
        num3 = new JButton("3");
        num4 = new JButton("4");
        num5 = new JButton("5");
        num6 = new JButton("6");
        num7 = new JButton("7");
        num8 = new JButton("8");
        num9 = new JButton("9");


        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bdel = new JButton(".");
        bclr = new JButton("CLEAR");
        bdel = new JButton("DELETE");

        tf.setBounds(30,40,280,30);
          
        num7.setBounds(40,100,50,40);
        num8.setBounds(110,100,50,40);
        num9.setBounds(180,100,50,40);
        bdiv.setBounds(250,100,50,40);

        num4.setBounds(40,170,50,40);
        num5.setBounds(110,170,50,40);
        num6.setBounds(250,170,50,40);
        bmul.setBounds(250,170,50,40);

        num1.setBounds(40,240,50,40);
        num2.setBounds(110,240,50,40);
        num3.setBounds(250,240,50,40);
        bsub.setBounds(250,240,50,40);

        bdec.setBounds(40,310,50,40);
        num0.setBounds(110,310,50,40);
        beq.setBounds(250,310,50,40);
        badd.setBounds(250,310,50,40);

        bdel.setBounds(60,380,100,40);
        bclr.setBounds(180,380,100,40);

        jft.add(tf);
        jft.add(num0);
        jft.add(num1);        
        jft.add(num2);        
        jft.add(num3);        
        jft.add(num4);        
        jft.add(num5);        
        jft.add(num6);        
        jft.add(num7);        
        jft.add(num8);        
        jft.add(num9);        
        jft.add(badd);        
        jft.add(bsub);        
        jft.add(bmul);        
        jft.add(bdiv);
        jft.add(bdec);        
        jft.add(beq);        
        jft.add(bdel);        
        jft.add(bclr);
        
        jft.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);





    }



    public static void main(String args[]){
        new Cal();
    }
}
