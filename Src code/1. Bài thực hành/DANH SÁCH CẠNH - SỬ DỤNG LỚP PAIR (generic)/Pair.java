// Created by Nguyễn Mạnh Quân at 12:01 on 13/11/2022

package A;

public class Pair<S, T>
{
    private S first;
    private T second;

    public Pair(S first, T second)
    {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString()
    {
        return "(" + first + "," + second + ")";
    }
}
