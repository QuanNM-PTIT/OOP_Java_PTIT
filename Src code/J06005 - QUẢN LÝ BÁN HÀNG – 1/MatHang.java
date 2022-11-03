package J06005;

public class MatHang
{
    private String maMH;
    private String tenMH;
    private String donViTinh;
    private int giaMua;
    private int giaBan;

    public MatHang(int maMH, String tenMH, String donViTinh, int giaMua, int giaBan)
    {
        this.maMH = "MH" + String.format("%03d", maMH);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public String getMaMH()
    {
        return maMH;
    }

    public String getTenMH()
    {
        return tenMH;
    }

    public String getDonViTinh()
    {
        return donViTinh;
    }

    public int getGiaMua()
    {
        return giaMua;
    }

    public int getGiaBan()
    {
        return giaBan;
    }
}
