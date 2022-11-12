// Created by Nguyễn Mạnh Quân at 02:58 on 13/11/2022

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.sqrt;

public class J07029
{
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        ArrayList<Integer> prime = new ArrayList<>();
        int[] f = new int[1000005];
        for (int i : a)
            if (isPrime(i))
            {
                if (f[i] == 0)
                    prime.add(i);
                ++f[i];
            }
        Collections.sort(prime, Collections.reverseOrder());
        for (int i = 0; i < 10; ++i)
            System.out.println(prime.get(i) + " " + f[prime.get(i)]);
    }
}
