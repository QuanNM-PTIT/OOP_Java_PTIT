// Created by Nguyễn Mạnh Quân at 09:29 on 01/12/2022

package J07048;

public class Product implements Comparable<Product>
{
    private String ID;
    private String name;
    private int price;
    private int warrantyPeriod;

    public Product(String ID, String name, int price, int warrantyPeriod)
    {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + price + " " + warrantyPeriod;
    }

    @Override
    public int compareTo(Product o)
    {
        if (this.price != o.price)
            return o.price - this.price;
        return this.ID.compareTo(o.ID);
    }
}
