package Client;

import javax.swing.*;
import java.awt.*;

class ClientThread extends Thread
{
    String name;
    String password;
    public  ClientThread(String name,String password)
    {
        this.name = name;
        this.password = password;
    }

    @Override
    public void run()
    {
        new Client(name,password);
    }
}


public class UI extends JFrame
{

    public static void main(String[] args)
    {

        EventQueue.invokeLater(() -> {

            LoginFrame LF = new LoginFrame();
            ClientFrame CF=new ClientFrame();
            LF.setAlwaysOnTop(true);
            LF.setVisible(true);
            CF.setVisible(true);


        });
    }
}

class LoginFrame extends JFrame
{

    JButton jb1, jb2;
    JTextField jtf;
    JPasswordField jpwd;
    JLabel jl1, jl2;
    JPanel jp1, jp2, jp3;
    boolean has = false;
    Client client;
    String name;
    String password;

    public LoginFrame()
    {

        jb1 = new JButton("确认");

        jb2 = new JButton("取消");

        jtf = new JTextField(10);

        jpwd = new JPasswordField(10);


        jl1 = new JLabel("用户名：");
        jl2 = new JLabel("密  码：");

        jb1.addActionListener((event) -> {
        name = jtf.getText();
            name = name.concat("\r\n");
            char[] pw = jpwd.getPassword();
            password = new String(pw);
            has = true;
            new ClientThread(name,password).start();
            setVisible(false);
        });

        jb2.addActionListener(e -> {
            System.exit(0);
        });

        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();


        this.setLayout(new GridLayout(3, 1, 5, 5));
        jp1.add(jl1);
        jp1.add(jtf);

        jp2.add(jl2);
        jp2.add(jpwd);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setTitle("登录界面");
        this.setSize(280, 160);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }


}


class ClientFrame extends JFrame
{
    private final int screenHeight;
    private final int screenWidth;

    public ClientFrame()
    {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        setSize(screenWidth / 2, screenHeight / 2);
        setLocationByPlatform(true);
        setTitle("性感子龙，在线陪聊");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
