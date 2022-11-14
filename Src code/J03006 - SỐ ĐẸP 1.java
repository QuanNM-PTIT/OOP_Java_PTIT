// Created by Nguyễn Mạnh Quân at 01:17 on 15/11/2022

import java.util.*;

public class J03006
{
    static String solve(String s)
    {
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) % 2 == 1)
                return "NO";
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
