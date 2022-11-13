// Created by Nguyễn Mạnh Quân at 12:23 on 13/11/2022

package C;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        Set<String> mySet = new TreeSet<>();
        ArrayList<MonHoc> a = new ArrayList<>();
        while (sc.hasNextLine())
        {
            MonHoc in = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (!mySet.contains(in.getMaMon()))
            {
                mySet.add(in.getMaMon());
                a.add(in);
            }
        }
        Collections.sort(a);
        for (MonHoc i : a)
            System.out.println(i);
    }
}
