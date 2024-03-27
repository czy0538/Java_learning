package PPT7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuDemo extends JFrame implements ActionListener
{
    JMenuBar menubar;
    JMenu menu,submenu;
    JMenuItem menuItem;
    JTextField tf;
    public MenuDemo()
    {
        super("Menu Demo");
        tf=new JTextField();
        menubar=new JMenuBar();
        setJMenuBar(menubar);

        menu=new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menubar.add(menu);

        menuItem=new JMenuItem("Open");
        menuItem.setMnemonic(KeyEvent.VK_O);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}

