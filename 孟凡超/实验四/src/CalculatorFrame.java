import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class CalculatorFrame extends JFrame
{
    private Stack<Double> data = new Stack<Double>();
    private ArrayList<Double> answer = new ArrayList<Double>();
    private CalculatorPanel calculatorPanel;
    private ButtonPanel buttonPanel;
    private ArrayList<Integer> symbol;
    private int fuck;


    public CalculatorFrame()
    {
        fuck = 0;
        symbol = new ArrayList<Integer>();
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        setSize(screenWidth / 4, screenHeight / 2);
        setLocationByPlatform(true);
        setTitle("CZY's small calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        buttonPanel = new ButtonPanel();
        calculatorPanel = new CalculatorPanel();
//        add(calculatorPanel, BorderLayout.NORTH);
//        add(buttonPanel, BorderLayout.SOUTH);

        Container contentPane = getContentPane();
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
        contentPane.add(calculatorPanel, BorderLayout.NORTH);

        setVisible(true);//一定在最后
    }

    private class ButtonPanel extends JPanel
    {
        private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b_add, b_sub, b_mult, b_division, b_sum, b_sin,b_cos,b_tan;

        public ButtonPanel()
        {
            setLayout(new GridLayout(7, 3));
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
            b_sin = new JButton("sin");
            b_cos=new JButton(("cos"));
            b_tan=new JButton("tan");

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
            add(b_sin);
            add(b_cos);
            add(b_tan);

            b1.addActionListener(event -> calculator(1, true, 0));
            b2.addActionListener(event -> calculator(2, true, 0));
            b3.addActionListener(event -> calculator(3, true, 0));
            b4.addActionListener(event -> calculator(4, true, 0));
            b5.addActionListener(event -> calculator(5, true, 0));
            b6.addActionListener(event -> calculator(6, true, 0));
            b7.addActionListener(event -> calculator(7, true, 0));
            b8.addActionListener(event -> calculator(8, true, 0));
            b9.addActionListener(event -> calculator(9, true, 0));
            b0.addActionListener(event -> calculator(0, true, 0));
            b_division.addActionListener(event -> calculator(0, false, 4));
            b_sum.addActionListener((event) ->
            calculator(0, false, 0));
            b_add.addActionListener((event) -> calculator(0, false, 1));
            b_sub.addActionListener(event -> calculator(0, false, 2));
            b_mult.addActionListener((event -> calculator(0, false, 3)));
            b_sin.addActionListener(event -> {fuck = 1;});
            b_cos.addActionListener(event -> {fuck = 2;});
            b_tan.addActionListener(event -> {fuck = 3;});

        }


    }


    private void calculator(double t, boolean what, int s)
    {

        if (what)
        {
            data.push(t);
            calculatorPanel.display.setText(String.valueOf(t));
        }
        else
        {
            symbol.add(s);
            switch (s)
            {
                case 0:
                     calculatorPanel.symbol_display.setText("谢谢使用");
                     break;
                case 1:
                     calculatorPanel.symbol_display.setText("+");
                     break;
                case 2:
                    calculatorPanel.symbol_display.setText("*");
                    break;
                case 3:
                    calculatorPanel.symbol_display.setText("/");
                    break;

            }
            int n = data.size();
            double sum = 0;
            for (int i = 0; i < n; i++)
            {
                sum += (data.pop() * Math.pow(10, i));

            }
            switch (fuck)
            {
                case 0:
                    answer.add(sum);
                    break;
                case 1:
                    sum=Math.sin(sum);
                    answer.add(sum);
                    fuck=0;
                    break;
                case 2:
                    sum=Math.cos(sum);
                    answer.add(sum);
                    fuck=0;
                    break;
                case 3:
                    sum=Math.tan(sum);
                    answer.add(sum);
                    fuck=0;
                    break;

            }


            if (answer.size() == 2)
            {
                double ans = 0;
                int temp = symbol.get(0);
                symbol.remove(0);
                switch (temp)
                {
                    case 0:
                        ans = answer.get(0);
                        calculatorPanel.display.setText(String.valueOf(ans));

                        System.exit(1);
                        break;
                    case 1:
                        ans = answer.get(0) + answer.get(1);
                        answer.clear();
                        answer.add(ans);
                        calculatorPanel.display.setText(String.valueOf(ans));
                        break;
                    case 2:
                        ans = answer.get(0) - answer.get(1);
                        answer.clear();
                        answer.add(ans);
                        calculatorPanel.display.setText(String.valueOf(ans));
                        break;
                    case 3:
                        ans = answer.get(0) * answer.get(1);
                        answer.clear();
                        answer.add(ans);
                        calculatorPanel.display.setText(String.valueOf(ans));
                        break;
                    case 4:
                        if (answer.get(1) == 0)
                        {
                            calculatorPanel.display.setText("被除数不能为0");
                            answer.remove(1);
                        }
                        else
                        {
                            ans = answer.get(0) / answer.get(1);
                            ans = ans = answer.get(0);
                            answer.clear();
                            answer.add(ans);
                            calculatorPanel.display.setText(String.valueOf(ans));
                        }

                        break;
                }
            }


        }
    }


    private class CalculatorPanel extends JPanel
    {
        JLabel display;
        JLabel symbol_display;


        public CalculatorPanel()
        {
            setBackground(Color.WHITE);
            setLayout(new GridLayout(2,1));
            display = new JLabel("欢迎使用计算器!", JLabel.CENTER);
            symbol_display=new JLabel("符号显示",JLabel.CENTER);

            add(display);
            add(symbol_display);


        }
    }

}

