package com.lch920619x.LongestPalindroma;


public class ExpCenterFinder {
	public String findPalindroma(String str) {
		
		int[] P=new int[str.length()-2];
		P[2]=1;
		int maxIndex = 0;
		for (int i=3;i<str.length()-3;i++) {
			while (str.charAt(i-P[i]-1) == str.charAt(i+P[i]+1))
			P[i]++;
			
			if (P[i]>P[maxIndex])
				maxIndex=i;
		}
		
		String palin = str.substring(maxIndex-P[maxIndex],maxIndex+P[maxIndex] );
		return palin;
		
	}
}