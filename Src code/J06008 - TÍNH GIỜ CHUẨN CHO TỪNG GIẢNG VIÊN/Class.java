package J06008;

public class Class
{
    private Teacher teacher;
    private Subject subject;
    private String totalTeachingHours;

    public Class(Teacher teacher, Subject subject, String totalTeachingHours)
    {
        this.teacher = teacher;
        this.subject = subject;
        this.totalTeachingHours = totalTeachingHours;
    }

    public Teacher getTeacher()
    {
        return teacher;
    }

    public void setTeacher(Teacher teacher)
    {
        this.teacher = teacher;
    }

    public Subject getSubject()
    {
        return subject;
    }

    public void setSubject(Subject subject)
    {
        this.subject = subject;
    }

    public String getTotalTeachingHours()
    {
        return totalTeachingHours;
    }

    public void setTotalTeachingHours(String totalTeachingHours)
    {
        this.totalTeachingHours = totalTeachingHours;
    }

    @Override
    public String toString()
    {
        return String.format("%s %s", subject.getName(), totalTeachingHours);
    }
}