package J05046;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while (n-- > 0)
            a.add(new MatHang(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        for (MatHang i : a)
            System.out.println(i);
    }
}
