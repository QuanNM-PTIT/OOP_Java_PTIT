// Created by Nguyễn Mạnh Quân at 19:33 on 26/11/2022

package J05081;

public class MatHang implements Comparable<MatHang>
{
    private String maMH;
    private String tenMH;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;
    private static int cnt = 1;

    public MatHang(String tenMH, String donViTinh, int giaMua, int giaBan)
    {
        this.maMH = String.format("MH%03d", cnt++);
        this.tenMH = tenMH;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString()
    {
        return maMH + " " + tenMH + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }

    @Override
    public int compareTo(MatHang o)
    {
        if (this.loiNhuan != o.loiNhuan)
            return o.loiNhuan - this.loiNhuan;
        return this.maMH.compareTo(o.maMH);
    }
}
