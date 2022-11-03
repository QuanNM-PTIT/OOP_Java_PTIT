// Created by Nguyễn Mạnh Quân at 14:54 on 03/11/2022

package J04022;

import java.util.*;

public class WordSet
{
    private ArrayList<String> arr;

    public WordSet(String s)
    {
        s = s.toLowerCase();
        this.arr = new ArrayList<>();
        String[] a = s.split("\\s+");
        this.arr.addAll(Arrays.asList(a));
    }

    public WordSet(ArrayList<String> arr)
    {
        this.arr = arr;
    }

    public WordSet union(WordSet A)
    {
        Set<String> mySet = new TreeSet<>();
        for (String i : arr)
            mySet.add(i);
        for (String i : A.arr)
            mySet.add(i);
        return new WordSet(new ArrayList<String>(mySet));
    }

    public WordSet intersection(WordSet A)
    {
        Set<String> mySet = new TreeSet<>();
        for (String i : arr)
            if (A.arr.contains(i))
                mySet.add(i);
        return new WordSet(new ArrayList<String>(mySet));
    }

    @Override
    public String toString()
    {
        String res = "";
        for (String i : arr)
            res += i + " ";
        return res;
    }
}
