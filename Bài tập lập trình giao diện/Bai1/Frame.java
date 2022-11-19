// Created by Nguyễn Mạnh Quân

package Bai1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame
{
    private JPanel panel;
    private JPanel tools;
    private JButton button;
    private JComboBox<String> comboBox;

    public Frame() throws HeadlessException
    {
        super("Color Box");
        panel = new JPanel();
        tools = new JPanel();
        button = new JButton("Change Color");
        comboBox = new JComboBox<>();

        setLayout(new BorderLayout());
        add(panel, BorderLayout.CENTER);
        tools.setLayout(new FlowLayout());
        tools.add(button);
        comboBox.addItem("Red");
        comboBox.addItem("Orange");
        comboBox.addItem("Yellow");
        comboBox.addItem("Green");
        comboBox.addItem("Blue");
        comboBox.addItem("Indigo");
        comboBox.addItem("Violet");
        tools.add(comboBox);
        add(tools, BorderLayout.SOUTH);
        panel.setBackground(new Color(255, 0, 0));

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                switch (comboBox.getSelectedItem().toString())
                {
                    case "Red":
                        panel.setBackground(new Color(255, 0, 0));
                        break;
                    case "Orange":
                        panel.setBackground(new Color(255,142,0));
                        break;
                    case "Yellow":
                        panel.setBackground(new Color(255,255,0));
                        break;
                    case "Green":
                        panel.setBackground(new Color(0,142,0));
                        break;
                    case "Blue":
                        panel.setBackground(new Color(0,192,192));
                        break;
                    case "Indigo":
                        panel.setBackground(new Color(64,0,152));
                        break;
                    case "Violet":
                        panel.setBackground(new Color(142,0,142));
                        break;
                }
            }
        });

        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
