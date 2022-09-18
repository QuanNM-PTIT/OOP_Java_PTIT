// Created by Nguyễn Mạnh Quân at 13:32 on 18/09/2022

import java.util.*;

public class G
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        Set<String> mySet = new TreeSet<>();
        while (sc.hasNextLine())
        {
            s = sc.nextLine();
            s.toLowerCase();
            mySet.add(s);
        }
        for (String i : mySet)
            System.out.println(i);
    }
}
