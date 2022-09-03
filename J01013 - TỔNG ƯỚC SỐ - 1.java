// Created by Nguyễn Mạnh Quân at 00:29 on 04/09/2022

import java.util.*;

public class J01013
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2000005];
        a[0] = a[1] = 1;
        for (int i = 2; i <= 1420; ++i)
            if (a[i] == 0)
                for (int j = i * i; j <= 2000000; j += i)
                    if (a[j] == 0)
                        a[j] = i;
        for (int i = 2; i <= 2000000; ++i)
            if (a[i] == 0)
                a[i] = i;
        long sum = 0;
        int n = sc.nextInt(), x;
        while (n-- > 0)
        {
            x = sc.nextInt();
            while (x > 1)
            {
                sum += a[x];
                x /= a[x];
            }
        }
        System.out.println(sum); 
    }
}
