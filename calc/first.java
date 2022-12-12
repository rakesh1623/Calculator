import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import javax.swing.*;

public class first {

    public static void main(String[] args) {
        calc obj = new calc();
    }
}

class calc extends JFrame{

    calc()
    {
        setSize(400,410);
        setLocation(700, 200);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);
        
    JTextArea disp = new JTextArea();
        
        disp.setText("");
        disp.setSize(370,70);
        disp.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        disp.setFont(new Font("SansSerif", Font.BOLD, 24));
        disp.setEditable(false);
        
        disp.setLocation(8,10);
        
        add(disp);

        JButton btn7 = new JButton("7");
        btn7.setSize(50,50);
        btn7.setLocation(20,110);

        btn7.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn7);

        JButton btn8 = new JButton("8");
        btn8.setSize(55,50);
        btn8.setLocation(90,110);

        btn8.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn8);

        JButton btn9 = new JButton("9");
        btn9.setSize(50,50);
        btn9.setLocation(170,110);

        btn9.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn9);

        
        JButton btn4 = new JButton("4");
        btn4.setSize(50,50);
        btn4.setLocation(20,175);

        btn4.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn4);

        JButton btn5 = new JButton("5");
        btn5.setSize(55,50);
        btn5.setLocation(90,175);

        btn5.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn5);

        JButton btn6 = new JButton("6");
        btn6.setSize(50,50);
        btn6.setLocation(170,175);

        btn6.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn6);

        
        JButton btn1 = new JButton("1");
        btn1.setSize(50,50);
        btn1.setLocation(20,245);

        btn1.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn1);

        JButton btn2 = new JButton("2");
        btn2.setSize(55,50);
        btn2.setLocation(90,245);

        btn2.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn2);

        JButton btn3 = new JButton("3");
        btn3.setSize(50,50);
        btn3.setLocation(170,245);

        btn3.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn3);
        
        JButton btn0 = new JButton("0");
        btn0.setSize(55,50);
        btn0.setLocation(90,310);
        btn0.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(btn0);
        
        JButton addd = new JButton("+");
        
        addd.setBackground(Color.darkGray);
        addd.setForeground(Color.white);
        addd.setSize(50,50);
        addd.setLocation(240,100);
        addd.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(addd);
        
        JButton sub = new JButton("-");
        
        sub.setBackground(Color.darkGray);
        sub.setForeground(Color.white);
        sub.setSize(50,50);
        sub.setLocation(240,160);
        sub.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(sub);
        
        JButton mul = new JButton("x");
        
        mul.setBackground(Color.darkGray);
        mul.setForeground(Color.white);
        mul.setSize(50,50);
        mul.setLocation(240,220);
        mul.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(mul);
        
        JButton div = new JButton("/");
        
        div.setBackground(Color.darkGray);
        div.setForeground(Color.white);
        div.setSize(50,50);
        div.setLocation(240,280);
        div.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(div);

        JButton clr = new JButton("CLR");

        clr.setBackground(Color.MAGENTA);
        clr.setSize(50,50);
        clr.setLocation(320, 140);
        clr.setBorder(null);
        clr.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(clr);
        
        JButton del = new JButton("DEL");
        del.setBackground(Color.MAGENTA);
        del.setSize(50,50);
        del.setLocation(320, 200);
        del.setBorder(null);
        del.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(del);
        
        
        JButton equalsto = new JButton("=");
        
        equalsto.setBackground(Color.cyan);
        equalsto.setSize(50,50);
        equalsto.setLocation(320 , 260);
        equalsto.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(equalsto);

        ActionListener al = new ActionListener()
        {
            String val;
            int prev_val;
            int one ,two;
            
            StringBuffer start_val = new StringBuffer();
            StringBuffer end_val = new StringBuffer();

            int i=0 , j=0;
            public void actionPerformed(ActionEvent ae)
            {
                if(ae.getSource()==btn0)
                {
                    if(i!=0)
                    {

                        end_val = end_val.append("0");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        else if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                        
                    }
                    else
                    {

                        start_val = start_val.append("0");
                        disp.setText(start_val.toString());
                    }
                    
                }
                if(ae.getSource()==btn1)
                {
                

                    if(i!=0)
                    {

                        end_val = end_val.append("1");
                   
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());

                    }
                    else
                    {

                        start_val = start_val.append("1");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn2)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("2");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("2");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn3)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("3");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("3");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn4)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("4");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("4");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn5)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("5");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("5");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn6)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("6");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("6");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn7)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("7");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("7");
                        disp.setText(start_val.toString());
                    }
                }if(ae.getSource()==btn8)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("8");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("8");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==btn9)
                {
                   
                    if(i!=0)
                    {
                        
                        end_val = end_val.append("9");
                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                    }
                    else
                    {
                        start_val = start_val.append("9");
                        disp.setText(start_val.toString());
                    }
                }
                if(ae.getSource()==addd)
                {
                    i=1;
                    
                    disp.setText(start_val.toString() + "+" + end_val.toString());
                    
                }
                if(ae.getSource()==sub)
                {
                    i=2;
                    
                    disp.setText(start_val.toString() + "-" + end_val.toString());
                    
                }
                if(ae.getSource()==mul)
                {
                    i=3;
                    
                    disp.setText(start_val.toString() + "x" + end_val.toString());
                    
                }
                if(ae.getSource()==div)
                {
                    i=4;
                    
                    disp.setText(start_val.toString() + "/" + end_val.toString());
                    
                }
                if(ae.getSource()==clr)
                {
                    start_val.delete(0, start_val.length());
                    end_val.delete(0, end_val.length());
                    start_val.append("0");
                    disp.setText(start_val.toString());
                }
                if(ae.getSource()==del)
                {
                    if(i!=0)
                    {
                        if(j!=0)
                        {
                            one = one/10;
                            disp.setText(String.valueOf(one));
                        }
                        else
                        {
                        end_val.deleteCharAt(end_val.length()-1);

                        if(i==1)
                        disp.setText(start_val.toString() + "+" + end_val.toString());
                        if(i==2)
                        disp.setText(start_val.toString() + "-" + end_val.toString());
                        else if(i==3)
                        disp.setText(start_val.toString() + "x" + end_val.toString());
                        else if(i==4)
                        disp.setText(start_val.toString() + "/" + end_val.toString());
                        }

                    }
                    else
                    {
                        
                        start_val.deleteCharAt(start_val.length()-1);
                            disp.setText(start_val.toString());

                        
                    }
                    
                }
                if (ae.getSource()==equalsto)
                {
                    // result= start_val;
                     one=Integer.parseInt(start_val.toString());
                     two = Integer.parseInt(end_val.toString());

                    if(i==1)
                    one = one+two;
                    else if(i==2)
                    one=one-two;
                    else if(i==3)
                    one=one*two;
                    else if(i==4)
                    one=one/two;

                    disp.setText(String.valueOf(one));

                    start_val.delete(0, start_val.length());
                    start_val.append(one);

                    end_val.delete(0, end_val.length());

                    j=1;
                    i=0;
                }

            }
        };    
        btn0.addActionListener(al);
        btn1.addActionListener(al);
        btn2.addActionListener(al);
        btn3.addActionListener(al);
        btn4.addActionListener(al);
        btn5.addActionListener(al);
        btn6.addActionListener(al);
        btn7.addActionListener(al);
        btn8.addActionListener(al);
        btn9.addActionListener(al);
        clr.addActionListener(al);
        del.addActionListener(al);
        addd.addActionListener(al);
        sub.addActionListener(al);
        mul.addActionListener(al);
        div.addActionListener(al);
        equalsto.addActionListener(al);
        
        setVisible(true);
}
}