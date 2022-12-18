package J07052;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("THISINH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ThiSinh> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new ThiSinh(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        int chiTieu = Integer.parseInt(sc.nextLine());
        Collections.sort(a);
        if (chiTieu > a.size())
            chiTieu = a.size();
        double diemChuan = a.get(chiTieu - 1).getTongDiem();
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh i : a)
        {
            if (i.getTongDiem() >= diemChuan)
                i.setStatus("TRUNG TUYEN");
            else
                i.setStatus("TRUOT");
            System.out.println(i);
        }
    }
}
