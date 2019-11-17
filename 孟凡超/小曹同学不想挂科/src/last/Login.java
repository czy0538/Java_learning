package last;

import javax.swing.*;
import java.awt.*;

public class Login
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(MyFrame::new);
    }
}

class MyFrame extends JFrame
{
    JPanel p1, p2;
    JButton b1, b2;
    JTextField t1;
    JPasswordField t2;
    JLabel l1, l2;

    MyFrame()
    {
        setTitle("用户登录");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(2, 2));
        setVisible(true);


        p1 = new JPanel();
        p2 = new JPanel();
        b1 = new JButton("登陆");
        b2 = new JButton("退出");
        l1 = new JLabel("用户名");
        l2 = new JLabel("密码");
        //别忘了设定宽度
        t1 = new JTextField(10);
        t2 = new JPasswordField(10);

        b1.addActionListener((event) -> {
            JOptionPane.showMessageDialog(this,
                    "Welcome to admin", "登录成功",
                    JOptionPane.YES_OPTION);
        });


        b2.addActionListener((event) ->
        {
            System.exit(-1);
        });

        p1.add(l1);
        p1.add(t1);
        p2.add(l2);
        p2.add(t2);
        add(p1);
        add(p2);
        add(b1);
        add(b2);

    }


}