// Created by Nguyễn Mạnh Quân at 18:01 on 12/11/2022

import java.util.*;

public class J02010
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
            for (int j = i + 1; j < n; ++j)
                if (a.get(i) > a.get(j))
                {
                    int tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
            for (int j : a)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
