// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01009
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] f = new long[25];
        f[1] = 1;
        for(int i = 2; i <= 20; ++i)
            f[i] = i * f[i - 1];
        long res = 0;
        for(int i = 1; i <= n; ++i)
            res += f[i];
        System.out.println(res);
    }
}