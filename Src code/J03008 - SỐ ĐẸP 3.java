// Created by Nguyễn Mạnh Quân at 01:25 on 15/11/2022

import java.util.*;

public class J03008
{
    static String solve(String s)
    {
        for (int i = 0; i < s.length(); ++i)
        {
            Character c = s.charAt(i);
            if (c != '2' && c != '3' && c != '5' && c != '7')
                return "NO";
        }
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev))
            return "YES";
        return "NO";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            System.out.println(solve(sc.nextLine()));
    }
}
