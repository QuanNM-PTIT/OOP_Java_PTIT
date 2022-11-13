// Created by Nguyễn Mạnh Quân at 12:59 on 13/11/2022

package E;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long res = 0;
        int[] a = new int[25];
        int[] b = new int[600005];
        sc.nextLine();
        for (int i = 1; i <= n; ++i)
            b[i] = sc.nextLine().length();
        for (int i = k; i > 0; --i)
            ++a[b[i]];
        for (int i = 1; i <= n; ++i)
        {
            ++a[b[i + k]];
            res += a[b[i]] - 1;
            --a[b[i]];
        }
        System.out.println(res);
    }
}