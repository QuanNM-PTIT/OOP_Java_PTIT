// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J08023
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t-- > 0)
        {
            n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i)
                a[i] = sc.nextInt();
            Stack<Integer> stL = new Stack<>(), stR = new Stack<>();
            int[] L = new int[n], R = new int[n];
            for(int i = 0; i < n; ++i)
            {
                while(!stL.isEmpty() && a[i] <= a[stL.peek()])
                    stL.pop();
                if(!stL.isEmpty())
                    L[i] = stL.peek() + 1;
                else
                    L[i] = 0;
                stL.push(i);
            }
            for(int i = n - 1; i >= 0; --i)
            {
                while(!stR.isEmpty() && a[i] <= a[stR.peek()])
                    stR.pop();
                if(!stR.isEmpty())
                    R[i] = stR.peek() - 1;
                else
                    R[i] = n - 1;
                stR.push(i);
            }
            long res = 0;
            for(int i = 0; i < n; ++i)
                res = Math.max(res, (long) a[i] * (R[i] - L[i] + 1));
            System.out.println(res);
        }
    }
}
