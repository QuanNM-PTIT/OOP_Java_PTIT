// Created by Nguyễn Mạnh Quân

import java.util.*;

public class J03030
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] s = str.toCharArray();
        int A = 0, B = 0;
        for(char i : s)
        {
            if(i == 'A')
            {
                if(A < B)
                    B = A + 1;
                else
                    ++B;
            }
            else
            {
                if(A < B)
                    ++A;
                else
                    A = B + 1;
            }
        }
        System.out.print(A);
    }
}
