// Created by Nguyễn Mạnh Quân at 13:42 on 02/09/2022

package J04004;

public class Fraction
{
    private long numerator, denominator;

    public Fraction(long numerator, long denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator()
    {
        return numerator;
    }

    public void setNumerator(long numerator)
    {
        this.numerator = numerator;
    }

    public long getDenominator()
    {
        return denominator;
    }

    public void setDenominator(long denominator)
    {
        this.denominator = denominator;
    }

    public long gcd(long a, long b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public void reduceFraction()
    {
        long GCD = gcd(this.numerator, this.denominator);
        this.numerator /= GCD;
        this.denominator /= GCD;
    }

    public void add(Fraction A)
    {
        long LCM = this.denominator * A.denominator / gcd(this.denominator, A.denominator);
        this.numerator *= LCM / this.denominator;
        A.numerator *= LCM / A.denominator;
        this.denominator = LCM;
        this.numerator += A.numerator;
        this.reduceFraction();
    }
}
