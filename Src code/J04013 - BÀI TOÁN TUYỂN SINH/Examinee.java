// Created by Nguyễn Mạnh Quân at 10:21 on 08/09/2022

package J04013;

public class Examinee
{
    private String ID, Name, Status;
    private double pMath, pPhysics, pChemistry, pTotal, pPriority;

    public Examinee(String ID, String name, double pMath, double pPhysics, double pChemistry)
    {
        this.ID = ID;
        this.Name = name;
        this.pMath = pMath;
        this.pPhysics = pPhysics;
        this.pChemistry = pChemistry;
        if (this.ID.charAt(2) == '1')
            this.pPriority = 0.5;
        else if (this.ID.charAt(2) == '2')
            this.pPriority = 1;
        else
            this.pPriority = 2.5;
        this.pTotal = this.pChemistry + this.pMath * 2 + this.pPhysics;
        if (this.pTotal + this.pPriority >= 24)
            this.Status = "TRUNG TUYEN";
        else
            this.Status = "TRUOT";
    }

    @Override
    public String toString()
    {
        String res = String.format("%s %s ", this.ID, this.Name);
        if (this.pPriority == (int) this.pPriority)
            res += String.format("%.0f ", this.pPriority);
        else
            res += String.format("%.1f ", this.pPriority);
        if (this.pTotal == (int) this.pTotal)
            res += String.format("%.0f ", this.pTotal);
        else
            res += String.format("%.1f ", this.pTotal);
        res += this.Status;
        return res;
    }
}
