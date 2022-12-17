package J05055;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main
{
    public static void main(String[] args) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<VanDongVien> a = new ArrayList<>();
        ArrayList<Long> thanhTichXepHang = new ArrayList<>();
        TreeSet<Long> mySet = new TreeSet<>();
        VanDongVien vanDongVien;
        while (n-- > 0)
        {
            vanDongVien = new VanDongVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(vanDongVien);
            thanhTichXepHang.add(vanDongVien.getThanhTichXepHang());
            mySet.add(vanDongVien.getThanhTichXepHang());
        }
        int xepHang = 1;
        HashMap<Long, Integer> myMap = new HashMap<>();
        for (long i : mySet)
        {
            myMap.put(i, xepHang);
            xepHang += Collections.frequency(thanhTichXepHang, i);
        }
        for (VanDongVien i : a)
            System.out.println(i + " " + myMap.get(i.getThanhTichXepHang()));
    }
}
