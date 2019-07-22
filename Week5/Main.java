package test1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// "()[]{}"
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		StringBuilder sb = new StringBuilder(16);	// �����ߵ�����
		int i;										// ��ŵ�ǰ�������ַ���λ��
		for (i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {		
			case '{':
			case '[':
			case '(':
				sb.append(s.charAt(i));				// �������ߵ����ţ��ͷ���sb��
				break;

			case '}':								// �����ŵ��߼�����ͬ

				if (sb.length() != 0) {				
					if (sb.charAt(sb.length() - 1) != '{') {// �����ƥ�䣬����false
						return false;
					} else {
						sb.deleteCharAt(sb.length() - 1);	//���ƥ�䣬�ʹ�sb��ɾ����Ӧ������
						continue;
					}
				}
				return false;						//�����ʱsb��û���ַ���Ҳ����false
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
		
		// ���������ж�������s�Ƿ������ϣ�sb���Ƿ����ַ�
		if (i == s.length() && sb.length() == 0) {
			return true;
		}
		return false;
	}

}

