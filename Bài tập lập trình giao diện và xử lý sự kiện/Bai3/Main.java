// Created by Nguyễn Mạnh Quân

package Bai3;

import javax.swing.*;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setTitle("Clock");
        frame.setLayout(new BorderLayout());
        frame.add(new StillClock(), BorderLayout.CENTER);
        frame.add(new DigitalClock(), BorderLayout.SOUTH);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
