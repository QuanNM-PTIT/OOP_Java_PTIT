// Created by Nguyễn Mạnh Quân at 08:44 on 30/11/2022

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J07031
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
        Scanner sc = new Scanner(System.in);
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) sc2.readObject();
        Set<Integer> set1 = new TreeSet<>(a);
        Set<Integer> set2 = new TreeSet<>(b);
        for (int i : set1)
            if (i < 1000000 - i && !set2.contains(i) && !set2.contains(1000000 - i) && isPrime(i) && set1.contains(1000000 - i) && isPrime(1000000 - i))
                System.out.println(i + " " + (1000000 - i));
    }
}
