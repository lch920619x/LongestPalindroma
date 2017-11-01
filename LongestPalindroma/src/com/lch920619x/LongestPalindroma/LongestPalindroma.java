package com.lch920619x.LongestPalindroma;

public class LongestPalindroma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=new String("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		PreProcess p=new PreProcess();
		str = p.preProcess(str);
		ExpCenterFinder expFinder = new ExpCenterFinder();
		str = expFinder.findPalindroma(str);
		System.out.println(str);
	}

}
