// Created by Nguyễn Mạnh Quân at 10:17 on 03/11/2022

package J06005;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Map<String, KhachHang> khachHangMap = new HashMap<>();
        Map<String, MatHang> matHangMap = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            KhachHang tmp = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            khachHangMap.put(tmp.getMaKH(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            MatHang tmp = new MatHang(i, sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            matHangMap.put(tmp.getMaMH(), tmp);
        }
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; ++i)
        {
            HoaDon tmp = new HoaDon(i, khachHangMap.get(sc.next()), matHangMap.get(sc.next()), sc.nextInt());
            System.out.println(tmp);
        }
    }
}
