import javax.swing.*;
import java.awt.*;

public class JframeDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrameDemo");
        JButton button = new JButton("press me");
        frame.getContentPane().add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
