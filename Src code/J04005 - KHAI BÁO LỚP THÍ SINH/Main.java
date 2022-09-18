// Created by Nguyễn Mạnh Quân at 14:19 on 02/09/2022

package J04005;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Examinee A = new Examinee();
        A.setName(s);
        s = sc.nextLine();
        A.setDateOfBirth(s);
        double x = sc.nextDouble();
        A.setP1(x);
        x = sc.nextDouble();
        A.setP2(x);
        x = sc.nextDouble();
        A.setP3(x);
        System.out.printf("%s %s %.1f", A.getName(), A.getDateOfBirth(), A.getTotal());
    }
}
