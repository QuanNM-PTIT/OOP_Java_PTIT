// Created by Nguyễn Mạnh Quân at 12:23 on 18/09/2022

import java.math.BigInteger;
import java.util.*;

public class F
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        while(true)
        {
            n = sc.nextInt();
            if (n == 0)
                break;
            ArrayList<BigInteger> a = new ArrayList<>();
            while (n-- > 0)
                a.add(sc.nextBigInteger());
            Collections.sort(a);
            if (a.get(0).equals(a.get(a.size() - 1)))
                System.out.println("BANG NHAU");
            else
                System.out.println(a.get(0) + " " + a.get(a.size() - 1));
        }
    }
}
