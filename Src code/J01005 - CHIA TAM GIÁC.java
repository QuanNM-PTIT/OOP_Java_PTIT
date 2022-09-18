// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01005
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        double n, h;
        while(t-- > 0)
        {
            n = sc.nextDouble();
            h = sc.nextDouble();
            for(int i = 1; i < n; ++i)
                System.out.printf("%.6f ", h * Math.sqrt(i / n));
            System.out.println();
        }
    }
}