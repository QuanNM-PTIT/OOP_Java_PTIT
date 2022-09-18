// Created by Nguyễn Mạnh Quân at 12:02 on 18/09/2022

import java.util.*;

public class A
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> a = new ArrayList<>();
        a.add(0L);
        a.add(1L);
        for (int i = 2; i <= 92; ++i)
            a.add(a.get(i - 1) + a.get(i - 2));
        int t = sc.nextInt();
        while (t-- > 0)
        {
            Long n = sc.nextLong();
            if (a.contains(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
