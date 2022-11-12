// Created by Nguyễn Mạnh Quân at 18:07 on 12/11/2022

import java.util.*;

public class J02011
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; ++i)
            a.add(sc.nextInt());
        for (int i = 0; i < n - 1; ++i)
        {
            System.out.print("Buoc " + (i + 1) + ": ");
            int m = i;
            for (int j = i + 1; j < n; ++j)
                if (a.get(j) < a.get(m))
                    m = j;
            int tmp = a.get(i);
            a.set(i, a.get(m));
            a.set(m, tmp);
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
