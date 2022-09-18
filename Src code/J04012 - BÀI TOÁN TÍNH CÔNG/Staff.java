// Created by Nguyễn Mạnh Quân at 18:11 on 07/09/2022

package J04012;

public class Staff
{
    private String maNV, hoVaTen, chucVu;
    private double luongCB, ngayCong, phuCap, tienLuong, thuNhap, tienThuong;

    public Staff(String hoVaTen, double luongCB, double ngayCong, String chucVu)
    {
        this.maNV = "NV01";
        this.hoVaTen = hoVaTen;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.tienLuong = this.luongCB * this.ngayCong;
        if (ngayCong >= 25)
            this.tienThuong = this.tienLuong * 20 / 100;
        else if (ngayCong >= 22)
            this.tienThuong = this.tienLuong * 10 / 100;
        if (this.chucVu.equals("GD"))
            this.phuCap = 250000;
        else if (this.chucVu.equals("PGD"))
            this.phuCap = 200000;
        else if (this.chucVu.equals("TP"))
            this.phuCap = 180000;
        else
            this.phuCap = 150000;
        this.thuNhap = this.tienLuong + this.tienThuong + this.phuCap;
    }

    public String getMaNV()
    {
        return maNV;
    }

    public String getHoVaTen()
    {
        return hoVaTen;
    }

    public double getPhuCap()
    {
        return phuCap;
    }

    public double getTienLuong()
    {
        return tienLuong;
    }

    public double getThuNhap()
    {
        return thuNhap;
    }

    public double getTienThuong()
    {
        return tienThuong;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %.0f %.0f %.0f %.0f", this.maNV, this.hoVaTen, this.tienLuong, this.tienThuong, this.phuCap, this.thuNhap);
    }
}
