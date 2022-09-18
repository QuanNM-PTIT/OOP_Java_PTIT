// Created by Nguyễn Mạnh Quân at 14:54 on 02/09/2022

package J04006;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Student A = new Student();
        A.setName(s);
        s = sc.nextLine();
        A.setClass(s);
        s = sc.nextLine();
        A.setDateOfBirth(s);
        float x = sc.nextFloat();
        A.setGPA(x);
        A.standardizedDateOfBirth();
        System.out.printf("%s %s %s %s %.2f", A.getID(), A.getName(), A.get_Class(), A.getDateOfBirth(), A.getGPA());
    }
}
