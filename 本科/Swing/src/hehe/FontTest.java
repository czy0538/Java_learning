package hehe;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.34 2015-05-12
 * @author Cay Horstmann
 */
public class FontTest
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            JFrame frame = new FontFrame();
            frame.setTitle("FontTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
