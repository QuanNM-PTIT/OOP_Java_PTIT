package J06008;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import J06008.Class;
import J06008.Subject;
import J06008.Teacher;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Class> classes = new ArrayList<>();
        HashMap<String, Teacher> teachers = new HashMap<>();
        HashMap<String, Subject> subjects = new HashMap<>();
        while (n-- > 0)
        {
            String inp = sc.nextLine();
            String[] tmp = inp.split("\\s+");
            String subjectId = tmp[0];
            String subjectName = String.join(" ", Arrays.copyOfRange(tmp, 1, tmp.length));
            Subject subject = new Subject(subjectId, subjectName);
            subjects.put(subjectId, subject);
        }
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0)
        {
            String inp = sc.nextLine();
            String[] tmp = inp.split("\\s+");
            String teacherId = tmp[0];
            String teacherName = String.join(" ", Arrays.copyOfRange(tmp, 1, tmp.length));
            Teacher teacher = new Teacher(teacherId, teacherName);
            teachers.put(teacherId, teacher);
        }
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0)
        {
            String inp = sc.nextLine();
            String[] tmp = inp.split("\\s+");
            String teacherId = tmp[0];
            String subjectId = tmp[1];
            String totalTeachingHours = tmp[2];
            Class class_ = new Class(teachers.get(teacherId), subjects.get(subjectId), totalTeachingHours);
            classes.add(class_);
        }
        String teacherId = sc.nextLine();
        System.out.println("Giang vien: " + teachers.get(teacherId).getName());
        float totalTeachingHours = 0;
        for (Class i : classes)
        {
            if (i.getTeacher().getId().equals(teacherId))
            {
                System.out.println(i);
                totalTeachingHours += Float.parseFloat(i.getTotalTeachingHours());
            }
        }
        System.out.printf("Tong: %.2f", totalTeachingHours);
    }
}