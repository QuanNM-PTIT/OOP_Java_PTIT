// Created by Nguyễn Mạnh Quân at 18:01 on 02/09/2022

package J04001;

public class Point
{
    private double x, y, dist;

    Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    Point(Point A)
    {
        this.x = A.x;
        this.y = A.y;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double distance(Point A)
    {
        return Math.sqrt((this.x - A.x) * (this.x - A.x) + (this.y - A.y) * (this.y - A.y));
    }

    public void setDist(double dist)
    {
        this.dist = dist;
    }

    @Override
    public String toString()
    {
        return String.format("%.4f", this.dist);
    }
}
