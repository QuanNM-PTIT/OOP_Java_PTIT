package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class KhachHang implements Comparable<KhachHang>
{
    private String tenKH;
    private String maKH;
    private String soPhong;
    private Date nhanPhong;
    private Date traPhong;
    private long tienDV;
    private long donGia;
    private long thanhTien;
    private long soNgay;
    private static int cnt = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public KhachHang(String tenKH, String soPhong, String nhanPhong, String traPhong, long tienDV) throws ParseException
    {
        maKH = String.format("KH%02d", cnt++);
        tenKH = tenKH.trim().toLowerCase();
        String[] s = tenKH.split("\\s+");
        this.tenKH = "";
        for (String i : s)
            this.tenKH += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.soPhong = soPhong;
        this.nhanPhong = sdf.parse(nhanPhong);
        this.traPhong = sdf.parse(traPhong);
        this.tienDV = tienDV;
        
        soNgay = ChronoUnit.DAYS.between(this.nhanPhong.toInstant(), this.traPhong.toInstant()) + 1;
        switch (soPhong.charAt(0))
        {
            case '1':
                donGia = 25;
                break;
            case '2':
                donGia = 34;
                break;
            case '3':
                donGia = 50;
                break;
            default:
                donGia = 80;
        }
        thanhTien = soNgay * donGia + tienDV;
    }
    
    @Override
    public String toString()
    {
        return maKH + " " + tenKH + soPhong + " " + soNgay + " " + thanhTien;
    }

    @Override
    public int compareTo(KhachHang o)
    {
        return (int) (o.thanhTien - thanhTien);
    }
}
