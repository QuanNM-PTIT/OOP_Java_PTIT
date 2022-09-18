// Created by Nguyễn Mạnh Quân at 12:23 on 18/09/2022

import java.math.BigInteger;
import java.util.*;

public class C
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            Long n = sc.nextLong();
            Long res = -1L;
            int sqr = (int) Math.sqrt(n);
            for (int i = 2; i <= sqr; ++i)
            {
                if (n % i == 0)
                {
                    res = Math.max(res, i);
                    while (n % i == 0)
                        n /= i;
                    sqr = (int) Math.sqrt(n);
                }
            }
            if (n > 1)
                res = n;
            System.out.println(res);
        }
    }
}
