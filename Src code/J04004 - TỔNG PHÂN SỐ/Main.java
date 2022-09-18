// Created by Nguyễn Mạnh Quân at 13:41 on 02/09/2022

package J04004;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        Fraction A = new Fraction(a, b);
        a = sc.nextLong();
        b = sc.nextLong();
        Fraction B = new Fraction(a, b);
        A.add(B);
        System.out.print(A.getNumerator() + "/" + A.getDenominator());
    }
}
