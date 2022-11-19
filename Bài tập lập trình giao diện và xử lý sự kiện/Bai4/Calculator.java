// Created by Nguyễn Mạnh Quân

package Bai4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener
{
    private static JTextField displayBox;

    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonDivide;
    private JButton buttonMultiply;
    private JButton buttonClear;
    private JButton buttonSqr;
    private JButton buttonEquals;
    private JButton buttonPow;

    Calculator()
    {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createUI();
        setSize(400, 450);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createUI()
    {
        JPanel panel = new JPanel();
        JPanel r1 = new JPanel();
        JPanel r2 = new JPanel();
        JPanel r3 = new JPanel();
        JPanel r4 = new JPanel();
        JPanel r5 = new JPanel();
        JPanel r6 = new JPanel();

        panel.setLayout(new GridLayout(6, 1));
        r1.setLayout(new FlowLayout());
        r2.setLayout(new FlowLayout());
        r3.setLayout(new FlowLayout());
        r4.setLayout(new FlowLayout());
        r5.setLayout(new FlowLayout());
        r6.setLayout(new FlowLayout());

        displayBox = new JTextField(22);
        displayBox.setPreferredSize(new Dimension(20, 60));
        displayBox.setEditable(false);

        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");

        buttonPlus = new JButton("+");
        buttonMinus = new JButton("-");
        buttonDivide = new JButton("/");
        buttonMultiply = new JButton("*");
        buttonClear = new JButton("C");
        buttonSqr = new JButton("√");
        buttonEquals = new JButton("=");
        buttonPow = new JButton("Lũy thừa");

        Dimension buttonSize = new Dimension(65, 65);
        button0.setPreferredSize(buttonSize);
        button1.setPreferredSize(buttonSize);
        button2.setPreferredSize(buttonSize);
        button3.setPreferredSize(buttonSize);
        button4.setPreferredSize(buttonSize);
        button5.setPreferredSize(buttonSize);
        button6.setPreferredSize(buttonSize);
        button7.setPreferredSize(buttonSize);
        button8.setPreferredSize(buttonSize);
        button9.setPreferredSize(buttonSize);

        buttonPlus.setPreferredSize(buttonSize);
        buttonMinus.setPreferredSize(buttonSize);
        buttonDivide.setPreferredSize(buttonSize);
        buttonMultiply.setPreferredSize(buttonSize);
        buttonClear.setPreferredSize(buttonSize);
        buttonSqr.setPreferredSize(buttonSize);
        buttonEquals.setPreferredSize(buttonSize);
        buttonPow.setPreferredSize(new Dimension(205, 65));

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);

        buttonPlus.addActionListener(this);
        buttonMinus.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonSqr.addActionListener(this);
        buttonEquals.addActionListener(this);
        buttonPow.addActionListener(this);

        r1.add(displayBox);

        r2.add(button1);
        r2.add(button2);
        r2.add(button3);
        r2.add(buttonPlus);

        r3.add(button4);
        r3.add(button5);
        r3.add(button6);
        r3.add(buttonMinus);

        r4.add(button7);
        r4.add(button8);
        r4.add(button9);
        r4.add(buttonDivide);

        r5.add(buttonSqr);
        r5.add(button0);
        r5.add(buttonClear);
        r5.add(buttonMultiply);

        r6.add(buttonPow);
        r6.add(buttonEquals);

        panel.add(r1);
        panel.add(r2);
        panel.add(r3);
        panel.add(r4);
        panel.add(r5);
        panel.add(r6);

        add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == buttonClear)
            displayBox.setText("");
        else if (e.getSource() == buttonEquals)
            displayBox.setText(calculate(displayBox.getText()));
        else if (e.getSource() == buttonSqr)
        {
            try
            {
                double result = Math.sqrt(Integer.parseInt(displayBox.getText().trim()));
                if (String.valueOf(result).equals("NaN"))
                    displayBox.setText("MATH ERORR!");
                else
                    displayBox.setText(String.valueOf(result));
            }
            catch (Exception ex)
            {
                displayBox.setText("MATH ERORR!");
            }
        }
        else if (e.getSource() == buttonPow)
            displayBox.setText(displayBox.getText() + "^");
        else
            displayBox.setText(displayBox.getText() + e.getActionCommand());
    }

    private int degree(char c)
    {
        if (c == '^') return 3;
        if (c == '*' || c == '/') return 2;
        if (c == '+' || c == '-') return 1;
        return 0;
    }

    private double calc(double a, double b, char c)
    {
        switch (c)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '^':
                return Math.pow(a, b);
            default:
                return a / b;
        }
    }

    private String calculate(String s)
    {
        try
        {
            Stack<Double> num = new Stack<>();
            Stack<Character> op = new Stack<>();
            double val, val1, val2;
            char top;
            num.push((double) 0);
            for (int i = 0; i < s.length(); ++i)
            {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                {
                    val = 0;
                    while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9')
                    {
                        val = val * 10 + s.charAt(i) - '0';
                        ++i;
                    }
                    num.push(val);
                    --i;
                }
                else
                {
                    while (!op.isEmpty() && degree(op.peek()) >= degree(s.charAt(i)))
                    {
                        val2 = num.peek();
                        num.pop();
                        val1 = num.peek();
                        num.pop();
                        top = op.peek();
                        op.pop();
                        num.push(calc(val1, val2, top));
                    }
                    op.push(s.charAt(i));
                }
            }
            while (!op.isEmpty())
            {
                val2 = num.peek();
                num.pop();
                val1 = num.peek();
                num.pop();
                top = op.peek();
                op.pop();
                num.push(calc(val1, val2, top));
            }
            double result = num.peek();
            if (result == (long) result)
                return String.valueOf((long) result);
            return String.valueOf(num.peek());
        }
        catch (Exception e)
        {
            return "MATH ERORR!";
        }
    }
}
