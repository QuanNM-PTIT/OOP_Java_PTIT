// Created by Nguyễn Mạnh Quân at 00:52 on 02/09/2022

package J04003;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        Fraction A = new Fraction(a, b);
        A.reduceFraction();
        System.out.println(A.getNumerator() + "/" + A.getDenominator());
    }
}
