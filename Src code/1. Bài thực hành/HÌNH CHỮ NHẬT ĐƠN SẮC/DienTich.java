// Created by Nguyễn Mạnh Quân at 14:01 on 13/11/2022

package I;

import java.util.*;

public class DienTich
{
    private int[] a;
    private int n;

    public DienTich(int[] a)
    {
        this.a = a;
        this.n = a.length;
    }

    public long getArea()
    {
        int[] l = new int[n], r = new int[n];
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st1.push(n - 1);
        for (int i = n - 1; i >= 0; --i)
        {
            while (!st1.isEmpty() && a[i] <= a[st1.peek()])
                st1.pop();
            if (!st1.isEmpty())
                r[i] = st1.peek() - 1;
            else
                r[i] = n - 1;
            st1.push(i);
        }
        for (int i = 0; i < n; ++i)
        {
            while (!st2.isEmpty() && a[i] <= a[st2.peek()])
                st2.pop();
            if (!st2.isEmpty())
                l[i] = st2.peek() + 1;
            else
                l[i] = 0;
            st2.push(i);
        }
        long res = 0;
        for (int i = 0; i < n; ++i)
            res = Math.max(res, (long) ((long) (a[i]) * (long) (r[i] - l[i] + 1)));
        return res;
    }
}
