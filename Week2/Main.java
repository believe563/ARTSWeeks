package test1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(isPalindrome(n));

	}

	public static boolean isPalindrome(int x) {
//		if (x < 0) {
//			return false;
//		}
//		int div = 1;
//		while (x / div >= 10) {
//			div = div * 10;
//		}
//		while (x > 0) {
//			int left = x / div;
//			int right = x % 10;
//			if (left != right) {
//				return false;
//			}
//			x = x % div;
//			x = x / 10;
//			div = div / 100;
//		}
//		return true;
		
		if((x<0)||(x!=0&&x%10==0)) {
			return false;
		}
		int reverse=0;
		while(reverse<x) {
			reverse=reverse*10+x%10;
			x=x/10;
		}
		if((reverse>x&&reverse/10==x)||reverse==x) {
			return true;
		}
		return false;

	}

}
