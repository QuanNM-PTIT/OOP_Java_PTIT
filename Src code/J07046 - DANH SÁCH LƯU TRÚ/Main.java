// Created by Nguyễn Mạnh Quân at 09:13 on 01/12/2022

package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> a = new ArrayList<>();
        DateFormat dfm = new SimpleDateFormat("dd/MM/yyyy");
        while (t-- > 0)
            a.add(new Customer(sc.nextLine(), sc.nextLine(), dfm.parse(sc.nextLine()), dfm.parse(sc.nextLine())));
        Collections.sort(a);
        for (Customer i : a)
            System.out.println(i);
    }
}
