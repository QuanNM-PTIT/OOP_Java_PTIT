// Created by Nguyễn Mạnh Quân at 15:28 on 13/11/2022

package D;

public class Number implements Comparable<Number>
{
    private int f;
    private int idx;

    public Number(int idx, int f)
    {
        this.f = f;
        this.idx = idx;
    }

    public int getF()
    {
        return f;
    }

    public int getIdx()
    {
        return idx;
    }

    @Override
    public int compareTo(Number o)
    {
        if (this.f != o.f)
            return o.f - this.f;
        return this.idx - o.idx;
    }
}
