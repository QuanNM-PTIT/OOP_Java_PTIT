// Created by Nguyễn Mạnh Quân at 01:11 on 04/09/2022

import java.util.*;

public class J02008
{

    static long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long[] LCM = new long[105];
        LCM[1] = 1;
        LCM[2] = 2;
        for (int i = 3; i <= 100; ++i)
            LCM[i] = (long) i * LCM[i - 1] / gcd((long) i, LCM[i - 1]);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            System.out.println(LCM[n]);
        }
    }
}
