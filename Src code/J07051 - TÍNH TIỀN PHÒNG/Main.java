package J07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<KhachHang> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new KhachHang(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine())));
        Collections.sort(a);
        for (KhachHang i : a)
            System.out.println(i);
    }
}
