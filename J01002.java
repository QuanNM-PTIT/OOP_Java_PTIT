// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01002
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n;
        while(t-- > 0)
        {
            n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        }
    }
}