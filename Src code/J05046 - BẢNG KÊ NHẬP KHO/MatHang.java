package J05046;

import java.util.HashMap;

public class MatHang
{
    private String maMH;
    private String tenHang;
    private long soLuong;
    private long donGia;
    private double chietKhau;
    private long thanhTien;
    private long tienChietKhau;
    private static HashMap<String, Integer> myMap = new HashMap<String, Integer>();

    public MatHang(String tenHang, long soLuong, long donGia)
    {
        this.tenHang = tenHang;
        tenHang = tenHang.toUpperCase();
        String s[] = tenHang.split("\\s+");
        maMH = String.format("%c%c", s[0].charAt(0), s[1].charAt(0));
        if (!myMap.containsKey(maMH))
            myMap.put(maMH, 1);
        int tmp = myMap.get(maMH);
        myMap.replace(maMH, tmp + 1);
        maMH += String.format("%02d", tmp);
        this.soLuong = soLuong;
        this.donGia = donGia;
        
        chietKhau = 5.0 / 100;
        if (soLuong < 5)
            chietKhau = 0;
        else if (soLuong < 8)
            chietKhau = 1.0 / 100;
        else if (soLuong <= 10)
            chietKhau = 2.0 / 100;
        
        thanhTien = soLuong * donGia;
        tienChietKhau = (long) (thanhTien * chietKhau);
        thanhTien -= tienChietKhau;
    }
    
    @Override
    public String toString()
    {
        return maMH + " " + tenHang + " " + tienChietKhau + " " + thanhTien;
    }
}
