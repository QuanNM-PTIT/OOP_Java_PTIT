// Created by Nguyễn Mạnh Quân at 03:40 on 13/11/2022

package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> a = (ArrayList<Pair>) sc.readObject();
        ArrayList<Pair> res = new ArrayList<>();
        Map<Pair, Integer> myMap = new HashMap<>();
        for (Pair i : a)
        {
            if (i.getFirst() < i.getSecond())
            {
                if (!myMap.containsKey(i))
                {
                    myMap.put(i, 1);
                    res.add(i);
                }
            }

        }
        Collections.sort(res);
        for (Pair i : res)
            System.out.println(i);
    }
}
