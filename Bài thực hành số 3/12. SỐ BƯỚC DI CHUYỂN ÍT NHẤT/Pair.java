// Created by Nguyễn Mạnh Quân at 14:46 on 13/11/2022

package L;

public class Pair<A, B, C>
{
    private A first;
    private B second;
    private C weight;

    public Pair(A first, B second, C weight)
    {
        this.first = first;
        this.second = second;
        this.weight = weight;
    }

    public A getFirst()
    {
        return first;
    }

    public B getSecond()
    {
        return second;
    }

    public C getWeight()
    {
        return weight;
    }
}
