// Created by Nguyễn Mạnh Quân at 16:42 on 10/11/2022

import java.util.*;

public class J02022
{
    static int n;

    static boolean check(String s)
    {
        for (int i = 1; i < n; ++i)
            if (Math.abs(s.charAt(i) - s.charAt(i - 1)) == 1)
                return false;
        return true;
    }

    static void Try(String s, boolean[] f)
    {
        if (s.length() == n)
        {
            if (check(s))
                System.out.println(s);
            return;
        }
        for (int i = 1; i <= n; ++i)
        {
            if (!f[i])
            {
                f[i] = true;
                if (s.length() + 1 <= n)
                    Try(s + Integer.toString(i), f);
                f[i] = false;
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            n = sc.nextInt();
            Try("", new boolean[n + 5]);
            System.out.println();
        }
    }
}
