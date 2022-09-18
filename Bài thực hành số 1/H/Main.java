// Created by Nguyễn Mạnh Quân at 13:34 on 18/09/2022

package H;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Student> List = new ArrayList<>();
        while (n-- > 0)
            List.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(List);
        for (Student i : List)
            System.out.println(i);
    }
}
