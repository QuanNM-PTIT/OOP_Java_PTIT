// Created by Nguyễn Mạnh Quân at 19:10 on 26/11/2022

package J05033;

public class Time implements Comparable<Time>
{
    private int h, m, s;

    public Time(int h, int m, int s)
    {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString()
    {
        return h + " " + m + " " + s;
    }

    @Override
    public int compareTo(Time o)
    {
        if (this.h != o.h)
            return this.h - o.h;
        if (this.m != o.m)
            return this.m - o.m;
        return this.s - o.s;
    }
}
