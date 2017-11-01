package com.lch920619x.LongestPalindroma;

public class ManacherFinder {

	static int ctr;
	public String findPalindroma(String str) {
		

		int[] P=new int[str.length()];
		int maxIndex = 0, C=1, R=1, i_mirror=0;
		for (int i=1;i<str.length()-1;i++) {
			i_mirror = 2*C-i;
			if (P[i_mirror]>=(R-i))
				P[i]=R-i;
			else
				P[i]=P[i_mirror];
			
			while (str.charAt(i-P[i]-1) == str.charAt(i+P[i]+1)) {
			P[i]++;
			ctr++;
			}
			if (P[i]+i>R) {
				R=P[i]+i;
				C=i;
			}
	
			
			if (P[i]>P[maxIndex])
				maxIndex=i;
		}

		String palin = str.substring(maxIndex-P[maxIndex],maxIndex+P[maxIndex] );
		
		System.out.println(ctr);
		return palin;
		
	}
}
