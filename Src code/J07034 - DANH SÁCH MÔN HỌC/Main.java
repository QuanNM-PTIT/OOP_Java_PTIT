// Created by Nguyễn Mạnh Quân at 15:21 on 30/11/2022

package J07034;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Subject i : a)
            System.out.println(i);
    }
}
