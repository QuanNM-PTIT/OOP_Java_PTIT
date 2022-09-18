// Created by Nguyễn Mạnh Quân at 15:49 on 02/09/2022

package J04008;

import java.util.*;

public class Point
{
    private double x, y;

    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getDist(Point A)
    {
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }
}
