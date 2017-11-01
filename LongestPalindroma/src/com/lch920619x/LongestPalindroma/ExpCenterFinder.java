package com.lch920619x.LongestPalindroma;


public class ExpCenterFinder {
	static int ctr;
	public String findPalindroma(String str) {
		
		int[] P=new int[str.length()];
		int maxIndex = 0;
		for (int i=1;i<str.length()-1;i++) {
			while (str.charAt(i-P[i]-1) == str.charAt(i+P[i]+1)) {
			P[i]++;
			ctr++;
			}
			
			if (P[i]>P[maxIndex])
				maxIndex=i;
		}

		String palin = str.substring(maxIndex-P[maxIndex],maxIndex+P[maxIndex] );
		System.out.println(ctr);
		return palin;
		
	}
}