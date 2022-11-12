// Created by Nguyễn Mạnh Quân at 02:53 on 13/11/2022

import java.io.File;
import java.util.*;
import java.io.IOException;

public class J07022
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext())
        {
            s = sc.next();
            try
            {
                Integer.parseInt(s);
            }
            catch (Exception e)
            {
                a.add(s);
            }
        }
        Collections.sort(a);
        for (String i : a)
            System.out.print(i + " ");
    }
}
