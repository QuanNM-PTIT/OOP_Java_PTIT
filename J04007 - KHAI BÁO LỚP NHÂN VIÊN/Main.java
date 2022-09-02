// Created by Nguyễn Mạnh Quân at 15:19 on 02/09/2022

package J04007;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[6];
        for (int i = 0; i < 6; ++i)
            a[i] = sc.nextLine();
        Staff A = new Staff(a[0], a[1], a[2], a[3], a[4], a[5]);
        System.out.printf("%s %s %s %s %s %s %s", A.getID(), A.getName(), A.getSex(), A.getDateOfBirth(), A.getAddress(), A.getTaxID(), A.getContractDate());
    }
}
