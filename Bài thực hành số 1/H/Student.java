// Created by Nguyễn Mạnh Quân at 13:34 on 18/09/2022

package H;

import java.util.*;

public class Student implements Comparable<Student>
{
    private String MSV, Ten, Ho, tenDem, soDienThoai, Email, hoVaTen;

    public Student(String MSV, String hoVaTen, String soDienThoai, String Email)
    {
        this.MSV = MSV;
        this.soDienThoai = soDienThoai;
        this.Email = Email;
        this.hoVaTen = hoVaTen;
        String[] a = hoVaTen.split("\\s+");
        this.Ten = a[a.length - 1];
        this.Ho = a[0];
        this.tenDem = "";
        for (int i = 0; i < a.length - 1; ++i)
            tenDem += a[i] + " ";
    }

    public String getMSV()
    {
        return MSV;
    }

    public String getTen()
    {
        return Ten;
    }

    public String getHo()
    {
        return Ho;
    }

    public String getTenDem()
    {
        return tenDem;
    }

    public String getHoVaTen()
    {
        return hoVaTen;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s %s", this.MSV, this.hoVaTen, this.soDienThoai, this.Email);
    }

    @Override
    public int compareTo(Student A)
    {
        if (this.Ten.compareTo(A.getTen()) != 0)
            return this.Ten.compareTo(A.getTen());
        if (this.Ho.compareTo(A.getHo()) != 0)
            return this.Ho.compareTo(A.getHo());
        if (this.tenDem.compareTo(A.getTenDem()) != 0)
            return this.tenDem.compareTo(A.getTenDem());
        return this.MSV.compareTo(A.getMSV());
    }
}
