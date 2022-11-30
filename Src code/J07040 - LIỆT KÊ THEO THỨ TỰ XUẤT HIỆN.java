// Created by Nguyễn Mạnh Quân at 15:35 on 30/11/2022

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class J07040
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        Scanner sc2 = new Scanner(new File("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) sc1.readObject();
        ArrayList<String> b = new ArrayList<>();
        Set<String> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        for (String i : a)
            set1.addAll(Arrays.asList(i.trim().toLowerCase().split("\\s+")));
        while (sc2.hasNextLine())
        {
            String s = sc2.nextLine().trim().toLowerCase();
            b.addAll(Arrays.asList(s.split("\\s+")));
        }
        for (String i : b)
        {
            if (!set2.contains(i) && set1.contains(i))
            {
                System.out.println(i);
                set2.add(i);
            }
        }
    }
}
