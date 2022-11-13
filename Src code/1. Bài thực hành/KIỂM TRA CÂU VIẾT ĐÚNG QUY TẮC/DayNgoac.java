// Created by Nguyễn Mạnh Quân at 13:25 on 13/11/2022

package G;

import java.util.Stack;

public class DayNgoac
{
    private String dayNgoac;

    public DayNgoac(String dayNgoac)
    {
        this.dayNgoac = "";
        for (int i = 0; i < dayNgoac.length(); ++i)
        {
            Character c = dayNgoac.charAt(i);
            if (c == '(' || c == ')' || c == '[' || c == ']')
                this.dayNgoac += String.valueOf(c);
        }
    }

    private boolean check()
    {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < dayNgoac.length(); ++i)
        {
            Character c = dayNgoac.charAt(i);
            if (c == '(')
                st.push(1);
            else if (c == '[')
                st.push(2);
            else if (c == ')' && !st.isEmpty() && st.peek() == 1)
                st.pop();
            else if (c == ']' && !st.isEmpty() && st.peek() == 2)
                st.pop();
            else
                return false;
        }
        return st.isEmpty();
    }

    @Override
    public String toString()
    {
        if (check())
            return "YES";
        return "NO";
    }
}
