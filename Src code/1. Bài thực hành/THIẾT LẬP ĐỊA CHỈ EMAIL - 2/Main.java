// Created by Nguyễn Mạnh Quân at 12:06 on 13/11/2022

package B;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        Set<String> mySet = new TreeSet<>();
        while (sc.hasNextLine())
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
