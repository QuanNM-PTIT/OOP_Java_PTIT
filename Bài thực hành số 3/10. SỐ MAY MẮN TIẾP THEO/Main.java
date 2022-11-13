// Created by Nguyễn Mạnh Quân at 13:32 on 13/11/2022

package J;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Queue<Long> q = new LinkedList<>();
        ArrayList<Long> luckyNum = new ArrayList<>();
        luckyNum.add(4L);
        luckyNum.add(7L);
        q.add(4L);
        q.add(7L);
        long top, x, y;
        while (q.peek() <= 1000000000)
        {
            top = q.poll();
            x = top * 10 + 4;
            y = top * 10 + 7;
            q.add(x);
            q.add(y);
            luckyNum.add(x);
            luckyNum.add(y);
        }
        int a, b, idx = luckyNum.size() - 1;
        a = sc.nextInt();
        b = sc.nextInt();
        long res = 0, cnt = 0;
        for (int i = 0; i < luckyNum.size(); ++i)
            if (luckyNum.get(i) >= a)
            {
                idx = i;
                break;
            }
        while (a <= b)
        {
            cnt = Math.min(luckyNum.get(idx), b) - a + 1;
            res += cnt * luckyNum.get(idx);
            a = (int) (luckyNum.get(idx) + 1);
            ++idx;
        }
        System.out.println(res);
    }
}
