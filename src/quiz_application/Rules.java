package quiz_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name; 
    JButton back,start;
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        JLabel heading=new JLabel("WELCOME "+name.toUpperCase()+" TO QUIZ QUEST ");
        heading.setBounds(170, 40, 900, 30);
        heading.setFont(new Font("MONTSERRAT", Font.BOLD,30));
        heading.setForeground(new Color(30,160,254));
        add(heading);
        
        JLabel rules=new JLabel();
        rules.setBounds(50, 90, 700, 350);
        rules.setFont(new Font("TAHOMA", Font.PLAIN,18));
        rules.setForeground(Color.WHITE);
        rules.setText(
            "<html>"+ 
                "1. Answer point to point." + "<br><br>" +
                "2. All the questions are compulsory." + "<br><br>" +
                "3. Every questions has a timer." + "<br><br>" +
                "4. It will get auto-submitted if you don't." + "<br><br>" +
            "<html>"
         );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250,500,120,25);
        back.setBackground(new Color(20,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,120,25);
        start.setBackground(new Color(20,144,254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(300,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String args[])
    {
        new Rules("USER");
    }
    
}
