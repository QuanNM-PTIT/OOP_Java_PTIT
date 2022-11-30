package J07033;

public class Student implements Comparable<Student>
{
    private String ID;
    private String name;
    private String studentClass;
    private String email;

    public Student(String ID, String name, String studentClass, String email)
    {
        this.ID = ID;
        this.name = "";
        name = name.trim().toLowerCase();
        String[] s = name.split("\\s+");
        for (String i : s)
            this.name += String.valueOf(i.charAt(0)).toUpperCase() + i.substring(1) + " ";
        this.studentClass = studentClass;
        this.email = email;
    }

    @Override
    public String toString()
    {
        return ID + " " + name + " " + studentClass + " " + email;
    }

    @Override
    public int compareTo(Student o)
    {
        return this.ID.compareTo(o.ID);
    }
}
