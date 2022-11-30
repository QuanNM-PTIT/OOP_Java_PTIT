// Created by Nguyễn Mạnh Quân at 15:12 on 30/11/2022

package J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> a = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Student i : a)
            System.out.println(i);
    }
}
