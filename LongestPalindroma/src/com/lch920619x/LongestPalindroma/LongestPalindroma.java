package com.lch920619x.LongestPalindroma;

public class LongestPalindroma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str,str1,str2;//=new String("abcabcb");
		PreProcess p=new PreProcess();
		RandomStringGenerator gen = new RandomStringGenerator();
		str = gen.getSaltString(10000);
		str = p.preProcess(str);
		ExpCenterFinder eFinder = new ExpCenterFinder();
		ManacherFinder mFinder = new ManacherFinder();
		str1 = eFinder.findPalindroma(str);
		str2 = mFinder.findPalindroma(str);
		System.out.println(str1);
		System.out.println(str2);
	}

}
