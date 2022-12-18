package J07072;

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
        ArrayList<HoTen> a = new ArrayList<>();
        while (sc.hasNextLine())
            a.add(new HoTen(sc.nextLine()));
        Collections.sort(a);
        for (HoTen i : a)
            System.out.println(i);
    }
}
