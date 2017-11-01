package com.lch920619x.LongestPalindroma;

import java.util.Random;

public class RandomStringGenerator {
	public String getSaltString(int length) {
        String SALTCHARS = "AB";//CDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
}
