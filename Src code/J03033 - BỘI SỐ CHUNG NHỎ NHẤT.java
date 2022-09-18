// Created by Nguyễn Mạnh Quân at 01:18 on 04/09/2022

import java.math.BigInteger;
import java.util.*;

public class J03033
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        String a, b;
        while(t-- > 0)
        {
            a = sc.nextLine();
            b = sc.nextLine();
            BigInteger x, y;
            x = new BigInteger(a, 10);
            y = new BigInteger(b, 10);
            BigInteger GCD = x.gcd(y);
            x = x.multiply(y);
            GCD = x.divide(GCD);
            System.out.println(GCD);
        }
    }
}