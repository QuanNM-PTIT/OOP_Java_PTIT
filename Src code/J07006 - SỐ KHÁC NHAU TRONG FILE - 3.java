// Created by Nguyễn Mạnh Quân at 02:20 on 13/11/2022

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07006
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) sc.readObject();
        int[] f = new int[1005];
        for (int i : a)
            ++f[i];
        for (int i = 0; i <= 1000; ++i)
            if (f[i] > 0)
                System.out.println(i + " " + f[i]);
    }
}
