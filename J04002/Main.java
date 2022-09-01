// Created by Nguyễn Mạnh Quân

package J04002;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Rectange A = new Rectange();
        double x = sc.nextDouble();
        A.setWidth(x);
        x = sc.nextDouble();
        A.setHeight(x);
        String s = sc.next();
        s = s.toLowerCase();
        s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);
        A.setColor(s);
        if(A.getWidth() > 0 && A.getHeight() > 0)
            System.out.printf("%.0f %.0f %s", A.findPerimeter(), A.findArea(), A.getColor());
        else
            System.out.print("INVALID");
    }
}
