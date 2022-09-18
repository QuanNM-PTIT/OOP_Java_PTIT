// Created by Nguyễn Mạnh Quân

package J04002;

public class Rectange
{
    private double width, height;
    private String color;

    Rectange()
    {
        this.height = this.width = 1;
    }

    Rectange(double width, double height, String color)
    {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double findArea()
    {
        return this.width * this.height;
    }

    public double findPerimeter()
    {
        return (this.width + this.height) * 2;
    }
}
