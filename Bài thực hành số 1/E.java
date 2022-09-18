// Created by Nguyễn Mạnh Quân at 12:58 on 18/09/2022

import java.util.*;

public class E
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> gr1 = new ArrayList<>(), gr2 = new ArrayList<>(), res = new ArrayList<>();
        HashMap<String, Integer> m1 = new HashMap<>(), m2 = new HashMap<>();
        while (n-- > 0)
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] a = s.split("\\s+");
            for (int i = 0; i < a.length; ++i)
                if (!m1.containsKey(a[i]))
                {
                    m1.put(a[i], 1);
                    gr1.add(a[i]);
                }
        }
        n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0)
        {
            String s = sc.nextLine();
            s = s.toLowerCase();
            String[] a = s.split("\\s+");
            for (int i = 0; i < a.length; ++i)
                if (!m2.containsKey(a[i]))
                {
                    m2.put(a[i], 1);
                    gr2.add(a[i]);
                }
        }
        for (String i : gr1)
            if (!m2.containsKey(i))
                res.add(i);
        Collections.sort(res);
        for (String i : res)
            System.out.print(i + " ");
        System.out.println();
        res.clear();
        for (String i : gr2)
            if (!m1.containsKey(i))
                res.add(i);
        Collections.sort(res);
        for (String i : res)
            System.out.print(i + " ");
    }
}
