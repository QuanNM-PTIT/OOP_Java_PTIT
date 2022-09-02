// Created by Nguyễn Mạnh Quân at 14:55 on 02/09/2022

package J04006;

public class Student
{
    private String ID, Name, Class, dateOfBirth;
    private float GPA;

    public Student()
    {
        this.ID = "B20DCCN001";
        this.Name = "";
        this.Class = "";
        this.dateOfBirth = "";
        this.GPA = 0;
    }

    public String getID()
    {
        return ID;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public String get_Class()
    {
        return Class;
    }

    public void setClass(String aClass)
    {
        Class = aClass;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public float getGPA()
    {
        return GPA;
    }

    public void setGPA(float GPA)
    {
        this.GPA = GPA;
    }

    public void standardizedDateOfBirth()
    {
        String[] a = this.dateOfBirth.split("/");
        this.dateOfBirth = "";
        while(a[0].length() < 2)
            a[0] = "0" + a[0];
        this.dateOfBirth += a[0] + "/";
        while(a[1].length() < 2)
            a[1] = "0" + a[1];
        this.dateOfBirth += a[1] + "/";
        while(a[2].length() < 4)
            a[2] = "0" + a[2];
        this.dateOfBirth += a[2];
    }
}
