// Created by Nguyễn Mạnh Quân at 02:42 on 13/11/2022

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class J07021
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        String s;
        while (true)
        {
            s = sc.nextLine().toLowerCase().trim();
            String[] a =  s.split("\\s+");
            if (a[0].compareTo("end") == 0)
                break;
            for (String i : a)
                System.out.print(String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ");
            System.out.println();
        }
    }
}
