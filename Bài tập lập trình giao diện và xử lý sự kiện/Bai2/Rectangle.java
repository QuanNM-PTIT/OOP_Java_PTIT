// Created by Nguyễn Mạnh Quân

package Bai2;

import java.awt.*;

public class Rectangle extends Geometry
{
    private final int WIDTH = 150 * scale;
    private final int HEIGHT = 90 * scale;

    public Rectangle(int scale, String type, Color color)
    {
        super(scale, type, color);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(color);
        if (type.equals("Fill"))
            g.fillRect(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
        else
            g.drawRect(getWidth() / 2 - WIDTH / 2, getHeight() / 2 - HEIGHT / 2, WIDTH, HEIGHT);
    }
}
