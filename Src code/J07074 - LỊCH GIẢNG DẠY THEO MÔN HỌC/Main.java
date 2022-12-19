package J07074;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, MonHoc> myMap = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0)
        {
            MonHoc tmp = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            myMap.put(tmp.getMaMH(), tmp);
        }
        
        sc = new Scanner(new File("LICHGD.in"));
        n = Integer.parseInt(sc.nextLine());
        ArrayList<LichGiangDay> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new LichGiangDay(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        
        String maMH = sc.nextLine();
        
        Collections.sort(a);
        
        System.out.printf("LICH GIANG DAY MON %s:\n", myMap.get(maMH).getTenMH());
        
        for (LichGiangDay i : a)
            if (i.getMaMH().equals(maMH))
                System.out.println(i);
    }
}
