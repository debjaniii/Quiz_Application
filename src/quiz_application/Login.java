
package quiz_application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/q111.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,-1,600,500);
        add(image);
        
        JLabel heading=new JLabel("QUIZ QUEST");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("MONTSERRAT", Font.BOLD,40));
        heading.setForeground(new Color(30,160,254));
        add(heading);
        
        JLabel name=new JLabel("ENTER YOUR NAME");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("TIMES NEW ROMAN", Font.BOLD,18));
        name.setForeground(new Color(20,140,24));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("TIMES NEW ROMAN",Font.BOLD,18));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(20,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915,270,120,25);
        back.setBackground(new Color(20,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules)
        {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }
    
}
