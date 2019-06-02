package test1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		Solution sol = new Solution();
		int revx=sol.reverse(x);
		System.out.println(revx);
	}
}

class Solution {

	public int reverse(int x) {
		String s=String.valueOf(x);
		byte[] b=s.getBytes();
		int lenOfs=s.length();
		int totalLen=s.length();
		if(x<0) {
			lenOfs-=1;
		}else {
			
		}
		long lastNum=0;
		for(int i=0;i<lenOfs;i++) {
			lastNum=lastNum*10+b[totalLen-i-1]-'0';
		}
		
		if(lastNum-Integer.MAX_VALUE>0&&x<0||lastNum>Integer.MAX_VALUE&&x>0) {
			return 0;
		}else {
			return (int) (x<0?-lastNum:lastNum);
		}
	}
}