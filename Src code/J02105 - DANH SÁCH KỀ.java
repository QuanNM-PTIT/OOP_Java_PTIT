// Created by Nguyễn Mạnh Quân at 00:46 on 15/11/2022

import java.util.*;

public class J02105
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x;
        for (int i = 1; i <= n; ++i)
        {
            System.out.print("List(" + i + ") = ");
            for (int j = 1; j <= n; ++j)
            {
                x = sc.nextInt();
                if (x == 1)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
