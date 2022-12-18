package J07072;

public class HoTen implements Comparable<HoTen>
{
    private String ho;
    private String tenDem;
    private String ten;

    public HoTen(String s)
    {
        s = s.toLowerCase();
        String[] arr = s.trim().split("\\s+");
        ho = tenDem = "";
        for (int i = 1; i < arr.length - 1; ++i)
            tenDem += String.valueOf(arr[i].charAt(0)).toUpperCase() + arr[i].substring(1) + " ";
        tenDem = tenDem.trim();
        ho = String.valueOf(arr[0].charAt(0)).toUpperCase() + arr[0].substring(1);
        ten = String.valueOf(arr[arr.length - 1].charAt(0)).toUpperCase() + arr[arr.length - 1].substring(1);
    }
    
    @Override
    public String toString()
    {
        return ho + " " + tenDem + " " + ten;
    }

    @Override
    public int compareTo(HoTen o)
    {
        if (!ten.equals(o.ten))
            return ten.compareTo(o.ten);
        if (!ho.equals(o.ho))
            return ho.compareTo(o.ho);
        return tenDem.compareTo(o.tenDem);
    }
}
