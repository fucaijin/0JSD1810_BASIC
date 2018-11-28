
package day07;

import java.util.Scanner;

public class Guessing3 {

	public static void main(String[] args) {
//		���������5��char[],���û��£����û�¶ԣ���۷�
		System.out.println("��ӭ��������,��������µ�5����ĸ:");
		Scanner scanner = new Scanner(System.in);
		
		char[] chs = generate();
		System.out.println(chs);
		
		int falseTimes = 0;
		do {
			System.out.println("�°�");
			String inputStr = scanner.nextLine().toUpperCase();
			if ("EXIT".equals(inputStr)) {
				System.out.println("��ӭ�´�������");
				break;
			}
			
			char[] inputCharArray = inputStr.toCharArray();
			int[] result = check(chs, inputCharArray);
			if(result[1] == chs.length){
				System.out.println("��ϲ��¶������÷�Ϊ:" + (100*chs.length - falseTimes*10));
				break;
			}else{
				falseTimes++;
				System.out.println("�¶�" + result[0] + "���ַ���" + result[1] +"��λ����ȷ");
			}
			
		} while (true);
		scanner.close();

	}

	private static int[] check(char[] chs, char[] inputCharArray) {
//		�Ƚ������ַ��Ƿ����
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < inputCharArray.length; j++) {
				if(chs[i] == inputCharArray[j]){
					result[0]++;
					if(i == j){
						result[1]++;
					}
					break;
				}
			}
		}
		return result;
	}

	private static char[] generate() {
		char[] chs = new char[5];
//		����5�����ظ��������ĸchar
//		char[] letters = {'A', 'B', ..., 'Z'}
		
//		׼����ĸ����
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65+i);
		}
		
		boolean[] used = new boolean[letters.length];
		
//		��������ĸ���ŵ�Ҫ���ص�������ȥ
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = (int) (Math.random()*letters.length);
			} while (used[index] == true);
			chs[i] = letters[index];
			used[index] = true;
		}
		
		return chs;
	}

}
