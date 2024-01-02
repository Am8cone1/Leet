package com.work.leet.day2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public  List<List<Integer>> findMatrix(int[] nums) {
    	int mp[]= new int[nums.length+1];
    	
    	ArrayList<List<Integer>>result=new ArrayList<>();
    	for(int num:nums) {
    		int freq=mp[num];
    		
    		if(freq==result.size()) {
    			result.add(new ArrayList<>()); // add one more row
    		}
    		result.get(freq).add(num);
    		mp[num]++;
    	}
    	
		return result;
        
    }
    
    public static void main(String[] args) {
        Solution myMatrixSolve = new Solution(); // Create an instance of the MyCookie class
        int[] greed = {1,3,4,1,2,3,1};
      

        List<List<Integer>> result = myMatrixSolve.findMatrix(greed);
        System.out.println("2-D arra is =: " + result);
    }
}