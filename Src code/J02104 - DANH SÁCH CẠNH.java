// Created by Nguyễn Mạnh Quân at 01:10 on 14/11/2022

import java.util.*;

public class J02104
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < n; ++j)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; ++i)
            for (int j = i + 1; j < n; ++j)
                if (a[i][j] == 1)
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
    }
}
