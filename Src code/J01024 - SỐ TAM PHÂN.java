// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01024
{

    static String solve(String s)
    {
        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) > '2')
                return "NO";
        return "YES";
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