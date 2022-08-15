// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J03036
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s, x;
        String[] a = new String[n];
        for(int i = 0; i < n; ++i)
            a[i] = sc.next();
        int res = (int) 1e9;
        boolean check = true;
        Loop:
        for(int i = 0; i < n; ++i)
        {
            String[] tmp = a.clone();
            int cnt = 0;
            for(int j = 0; j < n; ++j)
            {
                int d = 0;
                while(!tmp[j].equals(a[i]))
                {
                    tmp[j] += tmp[j].charAt(0);
                    tmp[j] = tmp[j].substring(1);
                    ++cnt;
                    ++d;
                    if(d > a[i].length())
                    {
                        check = false;
                        break Loop;
                    }
                }
            }
            res = Math.min(res, cnt);
        }
        if(check)
            System.out.print(res);
        else
            System.out.print(-1);
    }
}