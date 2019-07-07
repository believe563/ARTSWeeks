package test1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

import javax.management.QueryExp;

public class Main extends Main1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String s = sc.next();
		// System.out.println(longestCommonPrefix(new String[] { "alt", "alter", "alpha" }));
		// System.out.println(longestCommonPrefix(null));
		System.out.println(longestCommonPrefix(new String[] { "aca", "cba" }));
	}

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0 || ("").equals(strs)) {
			return "";
		}
		int minLen = Integer.MAX_VALUE;
		for (int i = 0; i < strs.length; i++) {
			if (strs[i].length() < minLen) {
				minLen = strs[i].length();
			}
		}
		int num = 0;
		int flag = 0;
		outer:
		for (int i = 0; i < minLen; i++) {
			flag = 0;
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].charAt(i) != strs[j - 1].charAt(i)) {
					flag = 1;
					break outer;
				}
			}
			if (flag == 0) {
				num++;
			}
		}
		return num > 0 ? strs[0].substring(0, num) : "";
	}

	
}
