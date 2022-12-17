package J05055;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class VanDongVien implements Comparable<VanDongVien>
{
    private String ID;
    private String hoVaTen;
    private String ngaySinh;
    private Date thoiGianXuatPhat;
    private Date thoiGianDenDich;
    private long thanhTichThucTe;
    private long thanhTichXepHang;
    private int uuTien;
    private int stt;
    private int tuoi;
    private static int cnt = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public VanDongVien(String hoVaTen, String ngaySinh, String thoiGianXuatPhat, String thoiGianDenDich) throws ParseException
    {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.thoiGianXuatPhat = sdf.parse(thoiGianXuatPhat);
        this.thoiGianDenDich = sdf.parse(thoiGianDenDich);
        stt = cnt++;
        this.ID = String.format("VDV%02d", stt);
        tuoi = 2021 - sdf2.parse(ngaySinh).getYear() - 1900;
        uuTien = 3;
        if (tuoi < 18)
            uuTien = 0;
        else if (tuoi < 25)
            uuTien = 1;
        else if (tuoi < 32)
            uuTien = 2;
        thanhTichThucTe = (this.thoiGianDenDich.getTime() - this.thoiGianXuatPhat.getTime()) / 1000;
        thanhTichXepHang = thanhTichThucTe - uuTien;
    }
    
    private String stringFormat(long s)
    {
        long h = s / 3600;
        long m = (s - 3600 * h) / 60;
        return String.format("%02d:%02d:%02d", h, m, s - h * 3600 - m * 60);
    }

    public long getThanhTichXepHang()
    {
        return thanhTichXepHang;
    }
    
    @Override
    public String toString()
    {
        return ID + " " + hoVaTen + " " + stringFormat(thanhTichThucTe) + " " + stringFormat(uuTien) + " " + stringFormat(thanhTichXepHang);
    }

    @Override
    public int compareTo(VanDongVien o)
    {
        return (int) (this.thanhTichXepHang - o.thanhTichXepHang);
    }
}
