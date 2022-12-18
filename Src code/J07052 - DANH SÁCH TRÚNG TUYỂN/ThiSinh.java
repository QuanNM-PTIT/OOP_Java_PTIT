package J07052;

import java.text.DecimalFormat;

public class ThiSinh implements Comparable<ThiSinh>
{
    private String maTS;
    private String hoTen;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double tongDiem;
    private double diemUuTien;
    private String status;

    public ThiSinh(String maTS, String hoTen, double diemToan, double diemLy, double diemHoa)
    {
        this.maTS = maTS;
        hoTen = hoTen.trim().toLowerCase();
        String[] s = hoTen.split("\\s+");
        this.hoTen = "";
        for (String i : s)
            this.hoTen += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.hoTen = this.hoTen.trim();
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        
        if (maTS.charAt(2) == '1')
            diemUuTien = 0.5;
        else if (maTS.charAt(2) == '2')
            diemUuTien = 1;
        else
            diemUuTien = 2.5;
        tongDiem = diemToan * 2 + diemLy + diemHoa + diemUuTien;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public double getTongDiem()
    {
        return tongDiem;
    }
    
    @Override
    public String toString()
    {
        return maTS + " " + hoTen + " " + (new DecimalFormat().format(diemUuTien)) + " " + (new DecimalFormat().format(tongDiem)) + " " + status;
    }

    @Override
    public int compareTo(ThiSinh o)
    {
        if (tongDiem > o.tongDiem)
            return -1;
        else if (tongDiem < o.tongDiem)
            return 1;
        return maTS.compareTo(o.maTS);
    }
}
