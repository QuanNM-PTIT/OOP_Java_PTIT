// Created by Nguyễn Mạnh Quân at 14:41 on 13/11/2022

package L;

import java.util.*;

public class Main
{
    static Scanner sc = new Scanner(System.in);

    static long solve()
    {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                a[i][j] = sc.nextInt();
        Queue<Pair<Integer, Integer, Integer>> q = new LinkedList<>();
        q.add(new Pair<>(0, 0, 0));
        boolean[][] visited = new boolean[n + 5][m + 5];
        Pair<Integer, Integer, Integer> top;
        int x, y, z, val;
        while (!q.isEmpty())
        {
            top = q.poll();
            x = top.getFirst();
            y = top.getSecond();
            z = top.getWeight();
            if (x == n - 1 && y == m - 1)
                return z;
            if (x < n - 1)
            {
                val = Math.abs(a[x][y] - a[x + 1][y]);
                if (x + val < n && !visited[x + val][y])
                {
                    visited[x + val][y] = true;
                    q.add(new Pair<>(x + val, y, z + 1));
                }
            }
            if (y < m - 1)
            {
                val = Math.abs(a[x][y] - a[x][y + 1]);
                if (y + val < m && !visited[x][y + val])
                {
                    visited[x][y + val] = true;
                    q.add(new Pair<>(x, y + val, z + 1));
                }
            }
            if (x < n - 1 && y < m - 1)
            {
                val = Math.abs(a[x][y] - a[x + 1][y + 1]);
                if (x + val < n && y + val < m && !visited[x + val][y + val])
                {
                    visited[x + val][y + val] = true;
                    q.add(new Pair<>(x + val, y + val, z + 1));
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int t = sc.nextInt();
        while (t-- > 0)
            System.out.println(solve());
    }
}
