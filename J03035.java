// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J03035
{

    static long solve(String a, String b)
    {
        int n = a.length();
        int res = 0;
        char A, B;
        for(int i = 0; i < n; ++i)
        {
            A = a.charAt(i);
            B = b.charAt(i);
            if(A != B)
            {
                if(A == '?')
                    res += ('9' - B) * Cnt(i + 1, a);
                else
                {
                    if(A > B)
                        return res + Cnt(i + 1, a);
                    else if(A < B)
                        return res;
                }
            }
        }
        return res;
    }

    static long Cnt(int idx, String s)
    {
        long res = 1;
        for(int i = idx; i < s.length(); ++i)
        {
            if(s.charAt(i) == '?')
                res *= 10;
        }
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String a, b;
        while(t-- > 0)
        {
            a = sc.nextLine();
            b = sc.nextLine();
            System.out.println(solve(a, b));
        }
    }
}