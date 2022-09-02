// Created by Nguyễn Mạnh Quân at 19:09 on 02/09/2022

package J04015;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Teacher A = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        System.out.printf("%s %s %d %d %d", A.getID(), A.getName(), A.getLevel(), A.getSubsidy(), A.getIncome());
    }
}
