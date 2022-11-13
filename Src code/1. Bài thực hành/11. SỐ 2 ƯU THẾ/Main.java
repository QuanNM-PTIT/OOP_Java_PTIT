// Created by Nguyễn Mạnh Quân at 13:48 on 13/11/2022

package K;

import java.util.*;

public class Main
{
    static boolean check(String s)
    {
        int cnt = 0;
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) == '2')
                ++cnt;
        return cnt > (s.length() / 2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<String> q = new LinkedList<>();
        ArrayList<String> a = new ArrayList<>();
        q.add("1");
        q.add("2");
        String top;
        while (a.size() < 1000)
        {
            top = q.poll();
            if (check(top))
                a.add(top);
            for (int i = 0; i <= 2; ++i)
                q.add(top + Integer.toString(i));
        }
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            for (int i = 0; i < n; ++i)
                System.out.print(a.get(i) + " ");
            System.out.println();
        }
    }
}
