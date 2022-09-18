// Created by Nguyễn Mạnh Quân at 14:51 on 18/09/2022

import java.util.*;

public class J
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] a = new int[n + 5];
        while (q-- > 0)
        {
            int l = sc.nextInt(), r = sc.nextInt();
            for (int i = l; i <= r; ++i)
                a[i] ^= 1;
        }
        for (int i = 1; i <= n; ++i)
            System.out.print(a[i] + " ");
    }
}
