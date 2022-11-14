// Created by Nguyễn Mạnh Quân at 01:58 on 15/11/2022

import java.util.*;

public class J03021
{
    static String val(Character c)
    {
        if (c <= 'c')
            return "2";
        else if (c <= 'f')
            return "3";
        else if (c <= 'i')
            return "4";
        else if (c <= 'l')
            return "5";
        else if (c <= 'o')
            return "6";
        else if (c <= 's')
            return "7";
        else if (c <= 'v')
            return "8";
        return "9";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().toLowerCase();
            String a = "";
            for (int i = 0; i < s.length(); ++i)
                a += val(s.charAt(i));
            String rev = new StringBuilder(a).reverse().toString();
            if (a.equals(rev))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
