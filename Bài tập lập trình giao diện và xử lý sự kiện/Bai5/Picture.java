// Created by Nguyễn Mạnh Quân

package Bai5;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Picture extends JPanel
{
    private BufferedImage img;

    public Picture(BufferedImage img)
    {
        this.img = img;
        setPreferredSize(new Dimension(200, 125));
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), null);
    }
}
