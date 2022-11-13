// Created by Nguyễn Mạnh Quân at 14:14 on 13/11/2022

package M;

import java.util.*;

public class Main
{
    static int n;
    static int[] a = {2, 3, 5, 7};
    static ArrayList<Long> res = new ArrayList<>();

    static boolean check(String s)
    {
        if (s.charAt(s.length() - 1) == '2')
            return false;
        Set<Character> mySet = new HashSet<>();
        for (int i = 0; i < s.length(); ++i)
            mySet.add(s.charAt(i));
        return mySet.size() == 4;
    }

    static void Try(String s)
    {
        if (s.length() > n)
            return;
        if (s.length() >= 4 && check(s))
            res.add(Long.parseLong(s));
        for (int i : a)
            Try(s + Integer.toString(i));
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Try("");
        Collections.sort(res);
        for (Long i : res)
            System.out.println(i);
    }
}
