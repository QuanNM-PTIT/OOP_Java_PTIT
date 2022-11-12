// Created by Nguyễn Mạnh Quân at 02:34 on 13/11/2022

package J07007;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.TreeSet;

public class WordSet
{
    private Set<String> mySet = new TreeSet<>();

    public WordSet(String s) throws IOException
    {
        Scanner sc = new Scanner(new File(s));
        while (sc.hasNext())
            mySet.add(sc.next().toLowerCase());
    }

    @Override
    public String toString()
    {
        String res = "";
        for (String i : mySet)
            res += i + "\n";
        return res;
    }
}
