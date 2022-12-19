package J07075;

public class LichGiangDay implements Comparable<LichGiangDay>
{
    private String maMH;
    private String thu;
    private String kip;
    private String giangVien;
    private String phongHoc;
    private String maNhom;
    private String tenMH;
    private static int cnt = 1;

    public LichGiangDay(String maMH, String thu, String kip, String giangVien, String phongHoc)
    {
        maNhom = String.format("HP%03d", cnt++);
        this.maMH = maMH;
        this.thu = thu;
        this.kip = kip;
        this.giangVien = giangVien;
        this.phongHoc = phongHoc;
    }

    public String getMaMH()
    {
        return maMH;
    }

    public String getGiangVien()
    {
        return giangVien;
    }

    public void setTenMH(String tenMH)
    {
        this.tenMH = tenMH;
    }
    
    @Override
    public String toString()
    {
        return maNhom + " " + tenMH + " " + thu + " " + kip + " " + phongHoc;
    }

    @Override
    public int compareTo(LichGiangDay o)
    {
        if (!thu.equals(o.thu))
            return thu.compareTo(o.thu);
        if (!kip.equals(o.kip))
            return kip.compareTo(kip);
        return giangVien.compareTo(o.giangVien);
    }
}
