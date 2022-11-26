// Created by Nguyễn Mạnh Quân at 19:33 on 26/11/2022

package J05081;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new MatHang(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        Collections.sort(a);
        for (MatHang i : a)
            System.out.println(i);
    }
}
