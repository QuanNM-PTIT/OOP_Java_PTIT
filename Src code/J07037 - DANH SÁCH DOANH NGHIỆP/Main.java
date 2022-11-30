// Created by Nguyễn Mạnh Quân at 15:29 on 30/11/2022

package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Company> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Company(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Company i : a)
            System.out.println(i);
    }
}
