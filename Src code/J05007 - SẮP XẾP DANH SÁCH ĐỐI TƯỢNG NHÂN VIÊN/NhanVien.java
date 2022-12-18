package J05007;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>
{
    private String maNV;
    private String tenNV;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String masoThue;
    private String ngayKyHopDong;
    private static int cnt = 1;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public NhanVien(String tenNV, String gioiTinh, String ngaySinh, String diaChi, String masoThue, String ngayKyHopDong) throws ParseException
    {
        maNV = String.format("%05d", cnt++);
        this.tenNV = tenNV;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = sdf.parse(ngaySinh);
        this.diaChi = diaChi;
        this.masoThue = masoThue;
        this.ngayKyHopDong = ngayKyHopDong;
    }
    
    @Override
    public String toString()
    {
        return maNV + " " + tenNV + " " + gioiTinh + " " + sdf.format(ngaySinh) + " " + diaChi + " " + masoThue + " " + ngayKyHopDong;
    }

    @Override
    public int compareTo(NhanVien o)
    {
        return ngaySinh.compareTo(o.ngaySinh);
    }
}
