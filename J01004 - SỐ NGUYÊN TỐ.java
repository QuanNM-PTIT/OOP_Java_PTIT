// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01004
{

    static String isPrime(int n)
    {
        if(n == 2 || n == 3)
            return "YES";
        if(n < 2 || n % 2 == 0 || n % 3 == 0)
            return "NO";
        int sqr = (int) Math.sqrt(n) + 1;
        for(int i = 5; i < sqr; i += 6)
            if(n % i == 0 || n % (i + 2) == 0)
                return "NO";
        return "YES";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            System.out.println(isPrime(n));
        }
    }
}