// Created by Nguyễn Mạnh Quân at 22:20 on 15/12/2022

package J07084;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Student implements Comparable<Student>
{
    private String name;
    private Date timeStart, timeEnd;
    private long timeOnline;

    public Student(String name, String timeStart, String timeEnd) throws ParseException
    {
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        this.timeStart = sdf.parse(timeStart);
        this.timeEnd = sdf.parse(timeEnd);
        this.timeOnline = ChronoUnit.MINUTES.between(this.timeStart.toInstant(), this.timeEnd.toInstant());
    }
    
    @Override
    public String toString()
    {
        return name + " " + timeOnline;
    }

    @Override
    public int compareTo(Student o)
    {
        if (this.timeOnline != o.timeOnline)
            return (int) (o.timeOnline - this.timeOnline);
        else
            return this.name.compareTo(o.name);
    }
    
}
