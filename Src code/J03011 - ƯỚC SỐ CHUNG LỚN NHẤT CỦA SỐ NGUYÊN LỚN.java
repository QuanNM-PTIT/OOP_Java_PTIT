// Created by Nguyễn Mạnh Quân at 01:44 on 15/11/2022

import java.math.BigInteger;
import java.util.*;

public class J03011
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            BigInteger a = new BigInteger(sc.nextLine());
            BigInteger b = new BigInteger(sc.nextLine());
            System.out.println(a.gcd(b));
        }
    }
}
