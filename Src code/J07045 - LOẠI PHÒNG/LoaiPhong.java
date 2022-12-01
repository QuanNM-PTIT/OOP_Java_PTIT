package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>
{
    private String data;
    private String name;

    public LoaiPhong(String s)
    {
        data = s;
        String arr[] = s.split("\\s+");
        this.name = arr[1];
    }

    @Override
    public String toString()
    {
        return data;
    }

    @Override
    public int compareTo(LoaiPhong o)
    {
        return this.name.compareTo(o.name);
    }
}
