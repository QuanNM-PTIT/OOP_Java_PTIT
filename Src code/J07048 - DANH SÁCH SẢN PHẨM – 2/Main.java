// Created by Nguyễn Mạnh Quân at 09:29 on 01/12/2022

package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Product(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (Product i : a)
            System.out.println(i);
    }
}
