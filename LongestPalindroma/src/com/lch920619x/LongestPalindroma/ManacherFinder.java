package com.lch920619x.LongestPalindroma;

public class ManacherFinder {

	public String findPalindroma(String str) {
		int[] P=new int[str.length()];
		int maxIndex = 0;
		for (int i=1;i<str.length()-1;i++) {
			while (str.charAt(i-P[i]-1) == str.charAt(i+P[i]+1))
			P[i]++;
			
			if (P[i]>P[maxIndex])
				maxIndex=i;
		}

		String palin = str.substring(maxIndex-P[maxIndex],maxIndex+P[maxIndex] );
		return palin;
		
	}
}
