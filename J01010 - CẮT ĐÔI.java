// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01010
{

    static String solve(String s)
    {
        char[] a = s.toCharArray();
        for(int i = 0; i < s.length(); ++i)
        {
            if(a[i] == '0' || a[i] == '1' || a[i] == '8' || a[i] == '9')
            {
                if(a[i] == '8' || a[i] == '9')
                    a[i] = '0';
            }
            else
                return "INVALID";
        }
        String res = "";
        int idx = 0;
        while(idx < s.length() && a[idx] == '0')
            ++idx;
        for(int i = idx; i < s.length(); ++i)
            res += a[i];
        if(res.length() == 0)
            return "INVALID";
        return res;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s;
        while(t-- > 0)
        {
            s = sc.next();
            System.out.println(solve(s));
        }
    }
}