// Created by Nguyễn Mạnh Quân at 10:20 on 08/09/2022

package J04013;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Examinee A = new Examinee(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
        System.out.println(A);
    }
}
