// Created by Nguyễn Mạnh Quân at 10:16 on 03/11/2022

package J06005;

public class KhachHang
{
    private String maKH;
    private String tenKH;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public KhachHang(int maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi)
    {
        this.maKH = "KH" + String.format("%03d", maKH);
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getMaKH()
    {
        return maKH;
    }

    public String getTenKH()
    {
        return tenKH;
    }

    public String getGioiTinh()
    {
        return gioiTinh;
    }

    public String getNgaySinh()
    {
        return ngaySinh;
    }

    public String getDiaChi()
    {
        return diaChi;
    }
}
