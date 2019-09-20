package hehe;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorld
{
    public static  void main( String [] args)
    {
        EventQueue.invokeLater(()->
        {
            var frame=new NotHelloWorldFrame();
            frame.setTitle("Hello world");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class NotHelloWorldFrame extends JFrame
{
    public NotHelloWorldFrame()
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setSize(screenWidth/2 , screenHeight/2 );
        setLocationByPlatform(true);
        //toBack();
        add(new NotHelloWorldComponent());
        pack();
    }
}

class NotHelloWorldComponent extends JComponent
{
    public static final int MESSAGE_X=75;
    public static final int MESSAGE_Y=75;
    private static final int DEFAULT_WIDTH=300;
    private static final int DEFAULT_HEIGHT=200;

    public void paintComponent(Graphics g)
    {
        g.drawString("Hello,world",MESSAGE_X,MESSAGE_Y);
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}