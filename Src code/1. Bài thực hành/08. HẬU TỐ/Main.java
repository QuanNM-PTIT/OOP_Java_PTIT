// Created by Nguyễn Mạnh Quân at 15:50 on 13/11/2022

package H;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            Stack<Long> st = new Stack<>();
            sc.nextLine();
            String s =  sc.nextLine();
            String a[] = s.split("\\s+");
            for (String i : a)
            {
                if (i.compareTo("+") == 0)
                {
                    long x = st.peek();
                    st.pop();
                    long y = st.peek();
                    st.pop();
                    st.push(x + y);
                }
                else if (i.compareTo("-") == 0)
                {
                    long x = st.peek();
                    st.pop();
                    long y = st.peek();
                    st.pop();
                    st.push(y - x);
                }
                else if (i.compareTo("*") == 0)
                {
                    long x = st.peek();
                    st.pop();
                    long y = st.peek();
                    st.pop();
                    st.push(y * x);
                }
                else if (i.compareTo("/") == 0)
                {
                    long x = st.peek();
                    st.pop();
                    long y = st.peek();
                    st.pop();
                    st.push(y / x);
                }
                else
                {
                    if (i.charAt(0) == '-')
                        st.push(-1 * Long.parseLong(i.substring(1)));
                    else
                        st.push(Long.parseLong(i));
                }
            }
            System.out.println(st.peek());
        }
    }
}
