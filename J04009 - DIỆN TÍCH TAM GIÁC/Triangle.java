// Created by Nguyễn Mạnh Quân at 00:25 on 03/09/2022

package J04009;

public class Triangle
{
    private Point A = new Point(), B = new Point(), C = new Point();
    private double AB, AC, BC;

    Triangle(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        A.setX(x1);
        A.setY(y1);
        B.setX(x2);
        B.setY(y2);
        C.setX(x3);
        C.setY(y3);
        this.AB = A.getDist(B);
        this.AC = A.getDist(C);
        this.BC = B.getDist(C);
    }

    @Override
    public String toString()
    {
        if (AB + AC <= BC || AC + BC <= AB || AB + BC <= AC)
            return String.format("INVALID");
        double p = (AB + AC + BC) / 2.0;
        return String.format("%.2f", Math.sqrt(p * (p - AB) * (p - AC) * (p - BC)));
    }
}
