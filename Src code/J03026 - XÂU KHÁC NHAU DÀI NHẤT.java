// Created by Nguyễn Mạnh Quân at 02:19 on 15/11/2022

import java.util.*;

public class J03026
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            if (a.equals(b))
                System.out.println(-1);
            else
                System.out.println(Math.max(a.length(), b.length()));
        }
    }
}
