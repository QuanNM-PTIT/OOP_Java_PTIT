// Created by Nguyễn Mạnh Quân at 15:27 on 13/11/2022

package D;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            Map<Integer, Integer> myMap = new HashMap<>();
            Map<Integer, Integer> m = new HashMap<>();
            ArrayList<Integer> a = new ArrayList<>();
            while (n-- > 0)
                a.add(sc.nextInt());
            for (int i = 0; i < a.size(); ++i)
            {
                if (myMap.containsKey(a.get(i)))
                {
                    int f = myMap.get(a.get(i));
                    myMap.replace(a.get(i), f + 1);
                }
                else
                {
                    myMap.put(a.get(i), 1);
                    m.put(a.get(i), i);
                }
            }
            Set<Number> mySet = new TreeSet<>();
            for (Map.Entry<Integer, Integer> i : myMap.entrySet())
                mySet.add(new Number(m.get(i.getKey()), i.getValue()));
            for (Number i : mySet)
            {
                for (int j = 0; j < i.getF(); ++j)
                    System.out.print(a.get(i.getIdx()) + " ");
            }
            System.out.println();
        }
    }
}
