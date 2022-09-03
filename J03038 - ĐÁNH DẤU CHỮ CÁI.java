// Created by Nguyễn Mạnh Quân at 01:20 on 04/09/2022

import java.util.*;

public class J03038
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] f = new int[130];
        int cnt = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); ++i)
        {
            if (f[s.charAt(i)] == 0)
            {
                ++cnt;
                f[s.charAt(i)] = 1;
            }
        }
        System.out.println(cnt);
    }
}
