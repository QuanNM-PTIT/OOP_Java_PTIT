// Created by Nguyễn Mạnh Quân at 12:45 on 25/11/2022

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class J07030
{
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA1.in"));
        Set<Integer> list1 = new TreeSet<>((ArrayList) sc.readObject());
        sc = new ObjectInputStream(new FileInputStream("DATA2.in"));
        Set<Integer> list2 = new TreeSet<>((ArrayList) sc.readObject());
        for (Integer i : list1)
            if (i < 1000000 - i && isPrime(i) && list2.contains(1000000 - i) && isPrime(1000000 - i))
                System.out.println(i + " " + (1000000 - i));
    }
}
