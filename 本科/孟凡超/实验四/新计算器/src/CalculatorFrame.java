import edu.princeton.cs.algs4.Stack;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CalculatorFrame extends JFrame
{

    private CalculatorPanel calculatorPanel;
    private ArrayList<Integer> symbol;
    private int screenHeight;
    private int screenWidth;


    public CalculatorFrame()
    {

        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        screenHeight = screenSize.height;
        screenWidth = screenSize.width;
        setSize(screenWidth / 4, screenHeight / 2);
        setLocationByPlatform(true);
        setTitle("CZY's small calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        ButtonPanel buttonPanel = new ButtonPanel();
        calculatorPanel = new CalculatorPanel();


        Container contentPane = getContentPane();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        contentPane.add(calculatorPanel, BorderLayout.NORTH);

        setVisible(true);//一定在最后
    }

    private class ButtonPanel extends JPanel
    {
        private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_add, b_sub, b_mult, b_division, b_sum, sin, cos, tan, sqrt, square, ln;


        public ButtonPanel()
        {
            setLayout(new GridLayout(8, 3));
            setBackground(Color.green);

            //按钮区
            b1 = new JButton("1");
            b2 = new JButton("2");
            b3 = new JButton("3");
            b4 = new JButton("4");
            b5 = new JButton("5");
            b6 = new JButton("6");
            b7 = new JButton("7");
            b8 = new JButton("8");
            b9 = new JButton("9");
            b0 = new JButton("0");
            b_add = new JButton("+");
            b_division = new JButton("/");
            b_mult = new JButton("*");
            b_sub = new JButton("-");
            b_sum = new JButton("=");
            sin = new JButton("sin(x)");
            cos = new JButton("cos(x)");
            tan = new JButton("tan(x)");
            sqrt = new JButton("sqrt(x)");
            square = new JButton("square(X)");
            ln = new JButton("ln(x)");

            add(b0);
            add(b1);
            add(b2);
            add(b3);
            add(b4);
            add(b5);
            add(b6);
            add(b7);
            add(b8);
            add(b9);
            add(b0);
            add(b_add);
            add(b_division);
            add(b_mult);
            add(b_sub);
            add(b_sum);
            add(sin);
            add(cos);
            add(tan);
            add(ln);
            add(sqrt);
            add(square);


        }


    }





    private class CalculatorPanel extends JPanel
    {

        JLabel display;


        public CalculatorPanel()
        {
            setBackground(Color.WHITE);
            setLayout(new BorderLayout());
            setSize(screenWidth / 4, screenHeight / 4);
            display = new JLabel("欢迎使用计算器!", JLabel.CENTER);
            display.setSize(screenWidth / 4, screenHeight / 4);



        }
    }

}

