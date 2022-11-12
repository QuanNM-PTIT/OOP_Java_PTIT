// Created by Nguyễn Mạnh Quân at 03:41 on 13/11/2022

package test;

import java.io.Serializable;

public class Pair implements Serializable, Comparable<Pair>
{
    private int first, second;

    public Pair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }

    public int getFirst()
    {
        return first;
    }

    public int getSecond()
    {
        return second;
    }

    @Override
    public int compareTo(Pair o)
    {
        return this.first - o.first;
    }

    @Override
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }
}
