package J07071;

public class HoTen implements Comparable<HoTen>
{
    private String ten;
    private String ho;
    private String hoVaTen;
    private String vietTat;

    public HoTen(String inp)
    {
        hoVaTen = inp;
        String[] s = inp.split("\\s+");
        vietTat = "";
        for (int i = 0; i < s.length - 1; ++i)
            vietTat += String.valueOf(s[i].charAt(0)) + ".";
        ten = s[s.length - 1];
        ho = s[0];
        vietTat += String.valueOf(ten.charAt(0));
    }
    
    public boolean compare(String s)
    {
        if (s.length() != vietTat.length())
            return false;
        for (int i = 0; i < s.length(); ++i)
        {
            if (s.charAt(i) == '*')
                continue;
            if (s.charAt(i) != vietTat.charAt(i))
                return false;
        }
        return true;
    }
    
    @Override
    public String toString()
    {
        return hoVaTen;
    }

    @Override
    public int compareTo(HoTen o)
    {
        if (!ten.equals(o.ten))
            return ten.compareTo(o.ten);
        return ho.compareTo(o.ho);
    }
}
