// Created by Nguyễn Mạnh Quân at 08:58 on 01/12/2022

package J07045;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while (n-- > 0)
        {
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for (LoaiPhong tmp : ds)
        {
            System.out.println(tmp);
        }
    }
}
