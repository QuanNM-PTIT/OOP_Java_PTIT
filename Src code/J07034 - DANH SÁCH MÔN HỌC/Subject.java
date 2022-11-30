package J07034;

public class Subject implements Comparable<Subject>
{
    private String ID;
    private String name;
    private String num;

    public Subject(String ID, String name, String num)
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
    public int compareTo(Subject o)
    {
        return this.name.compareTo(o.name);
    }
}
