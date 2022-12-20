package J07016;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Main
{
    static boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        if (n < 4)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;
        int sqr = (int) Math.sqrt(n);
        for (int i = 5; i <= sqr; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
    {
        ObjectInputStream inp = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) inp.readObject();
        inp = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b = (ArrayList<Integer>) inp.readObject();
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        TreeSet<Integer> mySet = new TreeSet<>();
        TreeSet<Integer> setA = new TreeSet<>();
        for (int i : a)
        {
            if (m1.containsKey(i))
            {
                int tmp = m1.get(i);
                m1.replace(i, tmp + 1);
            }
            else
                m1.put(i, 1);
            setA.add(i);
        }
        for (int i : b)
        {
            if (m2.containsKey(i))
            {
                int tmp = m2.get(i);
                m2.replace(i, tmp + 1);
            }
            else
                m2.put(i, 1);
            if (setA.contains(i) && isPrime(i))
                mySet.add(i);
        }
        for (int i : mySet)
            System.out.println(i + " " + m1.get(i) + " " + m2.get(i));
    }
}
