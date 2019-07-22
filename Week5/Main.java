package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// "()[]{}"
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		StringBuilder sb = new StringBuilder(16);	// 存放左边的括号
		int i;										// 存放当前所遍历字符的位置
		for (i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {		
			case '{':
			case '[':
			case '(':
				sb.append(s.charAt(i));				// 如果是左边的括号，就放在sb中
				break;

			case '}':								// 右括号的逻辑都相同

				if (sb.length() != 0) {				
					if (sb.charAt(sb.length() - 1) != '{') {// 如果不匹配，返回false
						return false;
					} else {
						sb.deleteCharAt(sb.length() - 1);	//如果匹配，就从sb中删除对应的括号
						continue;
					}
				}
				return false;						//如果这时sb中没有字符，也返回false
			case ']':
				if (sb.length() != 0) {
					if (sb.charAt(sb.length() - 1) != '[') {
						return false;
					} else {
						sb.deleteCharAt(sb.length() - 1);
						continue;
					}
				}
				return  false;
			case ')':
				if (sb.length() != 0) {
					if (sb.charAt(sb.length() - 1) != '(') {
						return false;
					} else {
						sb.deleteCharAt(sb.length() - 1);
						continue;
					}
				}
				return false;
			default:
				break;

			}
		}
		
		// 最后的两个判断条件：s是否遍历完毕；sb中是否还有字符
		if (i == s.length() && sb.length() == 0) {
			return true;
		}
		return false;
	}

}

