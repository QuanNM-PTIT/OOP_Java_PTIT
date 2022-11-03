// Created by Nguyễn Mạnh Quân at 13:30 on 03/11/2022

package J04014;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0)
        {
            PhanSo A = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo B = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo C = A.congPhanSo(B);
            C = C.nhanPhanSo(C);
            System.out.println(C + " " + A.nhanPhanSo(B.nhanPhanSo(C)));
        }
    }
}
