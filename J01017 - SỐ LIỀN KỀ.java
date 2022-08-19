// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01017
{

    static String solve(String s)
    {
        for(int i = 1; i < s.length(); ++i)
            if(Math.abs((s.charAt(i) - '0') - (s.charAt(i - 1) - '0')) != 1)
                return "NO";
        return "YES";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s = sc.next();
            System.out.println(solve(s));
        }
    }
}