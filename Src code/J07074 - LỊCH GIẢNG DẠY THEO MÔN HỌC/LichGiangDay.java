package J07074;

public class LichGiangDay implements Comparable<LichGiangDay>
{
    private String maMH;
    private String thu;
    private String kip;
    private String giangVien;
    private String phongHoc;
    private String maNhom;
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
    
    @Override
    public String toString()
    {
        return maNhom + " " + thu + " " + kip + " " + giangVien + " " + phongHoc;
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
