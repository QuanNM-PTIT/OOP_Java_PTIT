// Created by Nguyễn Mạnh Quân at 00:57 on 04/09/2022

import java.util.*;

public class J01025
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt(), x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int maxX = Math.max(x1, Math.max(x2, Math.max(x3, x4))), minX = Math.min(x1, Math.min(x2, Math.min(x3, x4))), maxY = Math.max(y1, Math.max(y2, Math.max(y3, y4))), minY = Math.min(y1, Math.min(y2, Math.min(y3, y4)));
        int c = Math.max(maxX - minX, maxY - minY);
        System.out.println(c * c);
    }
}
