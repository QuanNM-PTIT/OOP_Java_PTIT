// Created by Nguyễn Mạnh Quân at 17:34 on 12/11/2022

package J04020;

public class Pair<S, T>
{
    private T first;
    private S second;

    public Pair(T first, S second)
    {
        this.first = first;
        this.second = second;
    }

    public boolean check(int n)
    {
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; ++i)
            if (n % i == 0)
                return false;
        return true;
    }

    public boolean isPrime()
    {
        return check((Integer) this.first) && check((Integer) this.second);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", this.first, this.second);
    }
}
