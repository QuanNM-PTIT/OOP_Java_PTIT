// Created by Nguyễn Mạnh Quân at 01:29 on 04/09/2022

import java.util.*;

public class J03032
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0)
        {
            String s = sc.nextLine();
            s = s.replaceAll("\\s+", " ");
            String[] a = s.split(" ");
            for (String i : a)
            {
                StringBuilder tmp = new StringBuilder(i);
                System.out.print(tmp.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
