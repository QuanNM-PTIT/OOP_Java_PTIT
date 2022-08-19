// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J01016
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt = 0;
        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) == '4' || s.charAt(i) == '7')
                ++cnt;
        if(cnt == 4 || cnt == 7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}