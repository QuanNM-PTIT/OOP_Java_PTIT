// Created by Nguyễn Mạnh Quân at 11:50 on 02/12/2022

package J07050;

public class Product implements Comparable<Product>
{
    private String ID;
    private String name;
    private String group;
    private float p1;
    private float p2;
    private float p3;
    private static int cnt = 1;

    public Product(String name, String group, float p1, float p2)
    {
        this.ID = String.format("MH%02d", cnt++);
        this.name = name;
        this.group = group;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p2 - p1;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + group + " " + String.format("%.2f", p3);
    }

    @Override
    public int compareTo(Product o)
    {
        if (o.p3 > this.p3)
            return 1;
        else if (o.p3 < this.p3)
            return -1;
        return 0;
    }
}
