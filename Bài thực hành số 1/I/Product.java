// Created by Nguyễn Mạnh Quân at 14:16 on 18/09/2022

package I;

import java.util.*;

public class Product
{
    private String tenHang, maDonHang, sttDonHang;
    private long donGia, soLuong, giamGia, thanhTien;

    public Product(String tenHang, String maDonHang, long donGia, long soLuong)
    {
        this.tenHang = tenHang;
        this.maDonHang = maDonHang;
        this.donGia = donGia;
        this.soLuong = soLuong;
        if (this.maDonHang.substring(4).equals("2"))
        {
            this.giamGia = this.donGia * this.soLuong * 30 / 100;
            this.thanhTien = this.donGia * this.soLuong - this.giamGia;
        }
        else
        {
            this.giamGia = this.donGia * this.soLuong * 50 / 100;
            this.thanhTien = this.giamGia;
        }
        this.sttDonHang = String.valueOf(this.maDonHang.charAt(1)) + this.maDonHang.charAt(2) + this.maDonHang.charAt(3);
    }

    @Override
    public String toString()
    {
        return String.format("%s %s %s %d %d", this.tenHang, this.maDonHang, this.sttDonHang, this.giamGia, this.thanhTien);
    }
}
