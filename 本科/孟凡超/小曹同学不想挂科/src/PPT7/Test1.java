package PPT7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Test1
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("fuck girl");
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(new MyPanel());
        frame.setVisible(true);
    }

}

class MyPanel extends JPanel
{
    private int i=0;
    JLabel a=new JLabel("1");
    JLabel b=new JLabel("2");
    JLabel c=new JLabel("3");
    JLabel d=new JLabel("4");
    JToggleButton e=new JToggleButton("test");
    JCheckBox f=new JCheckBox("f");
    JCheckBox g=new JCheckBox("g");
    JCheckBox h=new JCheckBox("h");
    ButtonGroup g1=new ButtonGroup( );
    ButtonGroup g2=new ButtonGroup();
    String[] list;
    JComboBox<String> box;

    class buttonAction implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e)
        {
            i++;
            a.setText(i+"");
        }
    }
    MyPanel()
    {
        list= new String[]{"first", "second", "third"};
        box=new JComboBox<>(list);
        box.setSelectedIndex(2);
        box.setEditable(true);
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(list));
        JTextField jt=new JTextField("wenbenkuang");
        JList jl=new JList(list);

        g1.add(f);
        g2.add(g);
        g2.add(h);




        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        add(g);
        add(h);
        add(box);
        add(jt);

        f.addActionListener(new buttonAction());
        g.addActionListener(new buttonAction());
        h.addActionListener(new buttonAction());
        e.addActionListener((event)->{
        if(e.isSelected())
        {
            a.setText("selected e");
        }
        else
        {
            a.setText("fuck");
        }
    });


    }


}