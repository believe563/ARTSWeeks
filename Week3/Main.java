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

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(romanToInt(s));

	}

	public static int romanToInt(String s) {
		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			char x = s.charAt(i);
			char x1;
			if (i < s.length() - 1) {
				x1 = s.charAt(i + 1);
			}else {
				x1='0';
			}
			switch (x) {
			case 'M':
				num = num + 1000;
				break;
			case 'D':
				num = num + 500;
				break;
			case 'C':
				if (x1 == 'D') {
					num = num + 400;
					i++;
				} else if (x1 == 'M') {
					num = num + 900;
					i++;
				} else {
					num = num + 100;
				}
				break;
			case 'L':
				num = num + 50;
				break;
			case 'X':
				if (x1 == 'L') {
					num = num + 40;
					i++;
				} else if (x1 == 'C') {
					num = num + 90;
					i++;
				} else {
					num = num + 10;
				}
				break;
			case 'V':
				num = num + 5;
				break;
			case 'I':
				if (x1 == 'V') {
					num = num + 4;
					i++;
				} else if (x1 == 'X') {
					num = num + 9;
					i++;
				} else {
					num = num + 1;
				}
				break;
			}
		}
		return num;

	}
}
