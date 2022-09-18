// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01026
{

    static String solve(int n)
    {
        if(Math.sqrt(n) == (int) Math.sqrt(n))
            return "YES";
        return "NO";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0)
        {
            n = sc.nextInt();
            System.out.println(solve(n));
        }
    }
}