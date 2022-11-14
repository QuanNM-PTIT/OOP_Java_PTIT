// Created by Nguyễn Mạnh Quân at 01:04 on 15/11/2022

import java.util.*;

public class J03004
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            for (String i : a)
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            System.out.println();
        }
    }
}