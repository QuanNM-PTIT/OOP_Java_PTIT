// Created by Nguyễn Mạnh Quân at 18:10 on 07/09/2022

package J04012;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Staff A = new Staff(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), sc.nextLine());
        System.out.println(A);
    }
}
