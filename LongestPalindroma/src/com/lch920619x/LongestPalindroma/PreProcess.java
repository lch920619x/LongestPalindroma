package com.lch920619x.LongestPalindroma;

public class PreProcess {

	public String preProcess(String str){
		if(str.length()==0)
			return new String("$$");
		String newStr = new String("$#");
		for (int i=0; i<str.length();i++) {
			newStr=newStr+str.charAt(i)+"#";
		}
		newStr=newStr+"$";
		return newStr;
	}
}
