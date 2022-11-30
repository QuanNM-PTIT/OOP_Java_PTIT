package J07037;

public class Company implements Comparable<Company>
{
    private String ID;
    private String name;
    private String num;

    public Company(String ID, String name, String num)
    {
        this.ID = ID;
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + num;
    }

    @Override
    public int compareTo(Company o)
    {
        return this.ID.compareTo(o.ID);
    }
}
