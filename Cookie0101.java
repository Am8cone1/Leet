package com.work.leet.day1;

import java.util.*;

public class Cookie0101 {
	public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int g_len=g.length;
        int s_len=s.length;
        System.out.println("Greed Lenght="+g_len);
        System.out.println("Size lenght="+s_len);
        
        int i=0;
        int j=0;
        
        while(i<g_len && j<s_len) {
        	if(g[i]<= s[j]) {
        		i++;
        	}
        	j++;
        }
        return i;
        
    }

	public int findContentChildren(int[] g, int[] s) {
	        Arrays.sort(g);
	        Arrays.sort(s);
	        
	        int g_len=g.length;
	        int s_len=s.length;
	        System.out.println("Greed Lenght="+g_len);
	        System.out.println("Size lenght="+s_len);
	        
	        int i=0;
	        int j=0;
	        
	        while(i<g_len && j<s_len) {
	        	if(g[i]<= s[j]) {
	        		i++;
	        	}
	        	j++;
	        }
	        return i;
	        
	    }

}
