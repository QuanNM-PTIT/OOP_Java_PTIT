package J07084;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException, ParseException
    {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0)
            a.add(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        Collections.sort(a);
        for (Student i : a)
            System.out.println(i);
    }
}
