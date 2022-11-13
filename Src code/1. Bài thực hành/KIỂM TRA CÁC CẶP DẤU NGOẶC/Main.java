// Created by Nguyễn Mạnh Quân at 13:15 on 13/11/2022

package F;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0)
            System.out.println(new DayNgoac(sc.nextLine()));
    }
}
