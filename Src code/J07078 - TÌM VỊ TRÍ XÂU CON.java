import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File("STRING.in"));
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0)
        {
            String a = sc.nextLine();
            String b = sc.nextLine();
            if (a.length() >= b.length())
            {
                int len = a.length() - b.length();
                for (int i = 0; i <= len; ++i)
                    if (a.charAt(i) == b.charAt(0) && b.equals(a.substring(i, i + b.length())))
                        System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}