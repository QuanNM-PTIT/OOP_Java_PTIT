// Created by Nguyễn Mạnh Quân at 14:34 on 02/09/2022

package J04005;

public class Examinee
{
    private String name, dateOfBirth;
    private double p1, p2, p3;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public double getP1()
    {
        return p1;
    }

    public void setP1(double p1)
    {
        this.p1 = p1;
    }

    public double getP2()
    {
        return p2;
    }

    public void setP2(double p2)
    {
        this.p2 = p2;
    }

    public double getP3()
    {
        return p3;
    }

    public void setP3(double p3)
    {
        this.p3 = p3;
    }

    public double getTotal()
    {
        return this.p1 + this.p2 + this.p3;
    }
}
