package com.runner;

import java.util.HashSet;
import java.util.Set;

public class Random {

	public static void main(String[] args) {
		String input = "12446665555555112344221111";
		System.out.println(countSimilar(input));
		System.out.println(findMaxSameAndPos(input));

	}

	private static String countSimilar(String in) {
		String out = "";
		String[] arr = in.split("");
		Set<String> set = new HashSet<String>();
		for (String str : arr) {
			set.add(str);
		}
		for (String str : set) {
			out += "" + str + "(" + (in.length() - in.replaceAll(str, "").length()) + ")";
		}

		return out;
	}

	private static String findMaxSameAndPos(String in) {
		String out = "";
		String[] arr = in.split("");
		int pos = 1;
		int len = 1;
		int maxLen = 0;
		int maxpos = 0;
		String maxCh = "";
		String temp = arr[0];

		for (String str : arr) {
			if (!temp.equals(str)) {
				if (len > maxLen) {
					maxLen = len;
					maxCh = temp;
					maxpos = pos;
				}
				pos++;
				len = 1;
				temp = str;
			} else {
				len++;
			}
		}
		out = maxCh + " has the maxlength of " + maxLen + " and at position " + maxpos;
		return out;
	}
}
