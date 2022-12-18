package J07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<HoTen> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new HoTen(sc.nextLine()));
        int t = Integer.parseInt(sc.nextLine());
        String s;
        Collections.sort(a);
        while (t-- > 0)
        {
            ArrayList<HoTen> res = new ArrayList<>();
            s = sc.nextLine();
            for (HoTen i : a)
                if (i.compare(s))
                    System.out.println(i);
        }
    }
}