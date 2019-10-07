import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ActionEventDemo
{
    public static void main(String[ ] args)
    {
        JFrame frame =new JFrame("sb");
        JButton b=new JButton("fuck");
        b.addActionListener(e -> System.exit(0));
        frame.getContentPane().add(b, BorderLayout.CENTER);
        frame.setSize(200,100);
        frame.setVisible(true);
    }
}

