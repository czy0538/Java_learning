package PPT7;

import javax.swing.*;
import java.awt.*;

public class Test3
{
    public static void main(String[] args)
    {
        EventQueue.invokeLater(() ->
        {
            MyFrame frame = new MyFrame();
        });
    }

}

class MyFrame extends JFrame
{

    JLabel text;

    public MyFrame()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);
        setTitle("对话框功能测试");


        add(new MyPanel(), BorderLayout.CENTER);
        add(new TextPanel(), BorderLayout.NORTH);
        //dialog();
        //add(jd);

        setVisible(true);

    }

    class TextPanel extends JPanel
    {
        public TextPanel()
        {
            text = new JLabel("文本显示");
            setSize(300, 200);
            add(text);


        }
    }

    class MyPanel extends JPanel
    {
        public MyPanel()
        {
            JButton b1 = new JButton("show dialog");
            JButton b2 = new JButton("showMessageDialog");
            JButton b3 = new JButton("showConfirmDialog");
            JButton b4 = new JButton("showInputDialog");
            JButton b5=new JButton("FileChooer");
            JFileChooser jf=new JFileChooser();
            jf.add(new JLabel("open"));
            jf.setSize(200,200);

            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
           // add(jf);

            b1.addActionListener((event) -> {
                dialog();
            });

            b2.addActionListener((event) -> {
                messageDialog();
            });
            b3.addActionListener((event) -> {
                confirmDialog();
            });
            b4.addActionListener((event) -> {
                showInputDialog();
            });
            b5.addActionListener((event) -> {
                jf.setVisible(true);
            });
        }

        void dialog()
        {
            JDialog jd = new JDialog(MyFrame.this, "hehe", true);
            JTextField jt = new JTextField("oh yearrrrrrrrrr");
            jd.add(jt);
            jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            jd.setVisible(true);
            //jd.setDefaultCloseOperation(HIDE_ON_CLOSE);
        }

        void messageDialog()
        {
            JOptionPane.showMessageDialog(MyFrame.this,
                    "这是消息对话框的内容",
                    "这是消息对话框的标题",
                    JOptionPane.ERROR_MESSAGE);
        }

        void confirmDialog()
        {
            int confirm = JOptionPane.showConfirmDialog(MyFrame.this,
                    "确认对话框信息",
                    "确认对话框标题",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            switch (confirm)
            {
                case JOptionPane.YES_OPTION:
                    text.setText("Yes");
                    break;
                case JOptionPane.NO_OPTION:
                    text.setText("NO");
                    break;
                case JOptionPane.CANCEL_OPTION:
                    text.setText("CANCEL");
                    break;
                case JOptionPane.CLOSED_OPTION:
                    text.setText("CLOSED");
                    break;
                default:
                    text.setText("default");

            }
        }

        void showInputDialog()
        {
            String[] selections = new String[]{"first", "second", "third"};
            var select=JOptionPane.showInputDialog(MyFrame.this,
                    "输入选择对话框",
                    "标题栏",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    selections,
                    selections[0]
            );
            if (select!=null)
            {
                text.setText(select.toString());
            }
            else
            {
                text.setText("closed");
            }
        }


    }
}