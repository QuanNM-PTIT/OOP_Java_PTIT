// Created by Nguyễn Mạnh Quân at 12:07 on 13/11/2022

package B;

import java.util.*;

public class Email
{
    private String name;
    private String email;
    private static Map<String, Integer> myMap = new HashMap<>();

    public Email(String name)
    {
        name = name.trim().toLowerCase();
        String[] a = name.split("\\s+");
        this.name = "";
        for (String i : a)
            this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.email = a[a.length - 1];
        for (int i = 0; i < a.length - 1; ++i)
            this.email += String.valueOf(a[i].charAt(0));
        if (myMap.containsKey(this.email))
        {
            int cnt = myMap.get(this.email);
            myMap.replace(this.email, cnt + 1);
            this.email += Integer.toString(cnt);
        }
        else
            myMap.put(this.email, 2);
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return email + "@ptit.edu.vn";
    }
}
