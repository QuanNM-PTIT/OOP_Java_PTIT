// Created by Nguyễn Mạnh Quân at 18:00 on 02/09/2022

package J04001;

import java.util.*;

public class Main
{
    public static double distance(Point A, Point B)
    {
        return Math.sqrt((A.getX() - B.getX()) * (A.getX() - B.getX()) + (A.getY() - B.getY()) * (A.getY() - B.getY()));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            Point A = new Point(sc.nextDouble(), sc.nextDouble()), B = new Point(sc.nextDouble(), sc.nextDouble());
            A.setDist(A.distance(B));
            System.out.println(A);
        }
    }
}
