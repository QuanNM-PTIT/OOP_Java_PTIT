// Created by Nguyễn Mạnh Quân at 17:33 on 12/11/2022

package J04020;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++)
            {
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime())
                {
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
