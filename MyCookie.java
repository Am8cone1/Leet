package com.work.leet.day1;

import java.util.Arrays;

public class MyCookie {

    public int findContentChildren1(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int g_len = g.length;
        int s_len = s.length;
        System.out.println("Greed Length=" + g_len);
        System.out.println("Size length=" + s_len);

        int i = 0;
        int j = 0;

        while (i < g_len && j < s_len) {
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }

        System.out.println("Maximum number of content children: " + i);
        return i;
    }

    public static void main(String[] args) {
        MyCookie myCookieSolver = new MyCookie(); // Create an instance of the MyCookie class
        int[] greed = {1, 2, 3};
        int[] size = {1, 1};

        int result = myCookieSolver.findContentChildren1(greed, size);
        System.out.println("Maximum number of content children: " + result);
    }
}
