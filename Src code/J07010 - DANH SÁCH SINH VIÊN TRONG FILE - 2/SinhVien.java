// Created by Nguyễn Mạnh Quân at 20:39 on 26/11/2022

package J07010;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien
{
    private String ID;
    private String name;
    private String studentClass;
    private String birthday;
    private float GPA;
    private static int cnt = 1;

    public SinhVien(String name, String studentClass, String birthday, float GPA) throws ParseException
    {
        ID = String.format("B20DCCN%03d", cnt++);
        this.name = name;
        DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        this.studentClass = studentClass;
        this.birthday = date.format(date.parse(birthday));
        this.GPA = GPA;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + studentClass + " " + birthday + " " + String.format("%.2f", GPA);
    }
}
