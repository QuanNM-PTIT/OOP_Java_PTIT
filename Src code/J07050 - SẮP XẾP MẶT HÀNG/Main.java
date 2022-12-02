// Created by Nguyễn Mạnh Quân at 11:49 on 02/12/2022

package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Product(sc.nextLine(), sc.nextLine(), Float.parseFloat(sc.nextLine()), Float.parseFloat(sc.nextLine())));
        Collections.sort(a);
        for (Product i : a)
            System.out.println(i);
    }
}
