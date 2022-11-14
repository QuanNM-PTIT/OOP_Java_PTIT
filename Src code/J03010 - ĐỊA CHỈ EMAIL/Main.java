// Created by Nguyễn Mạnh Quân at 01:41 on 15/11/2022

package J03010;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Set<String> mySet = new TreeSet<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
        {
            Email e = new Email(sc.nextLine());
            if (!mySet.contains(e.getName()))
            {
                mySet.add(e.getName());
                System.out.println(e);
            }
        }
    }
}
