package J06005;

import java.awt.*;

public class HoaDon
{
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(int maHD, KhachHang khachHang, MatHang matHang, int soLuong)
    {
        this.maHD = String.format("HD%03d", maHD);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s %s %s %d %d %d %d", maHD, khachHang.getTenKH(), khachHang.getDiaChi(), matHang.getTenMH(), matHang.getDonViTinh(), matHang.getGiaMua(), matHang.getGiaBan(), soLuong, soLuong * matHang.getGiaBan());
    }
}
