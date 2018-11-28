package day07;

import java.util.Scanner;

public class Guessing4 {

	public static void main(String[] args) {
		// ��5��������ַ�
		Scanner scanner = new Scanner(System.in);
		// ����5������ģ��Ҳ��ظ����ַ�
		char[] chs = generate();
		System.out.println("��ӭ���ַ�");
		System.out.println(chs);
		// ���û�����(��������˳��Ļ����˳�)
		// �Ƚ��������м����ַ��������ַ�λ����ȷ
		while (true) {
			System.out.println("�°ɣ�");
			String inputStr = scanner.nextLine().toUpperCase();
			if("EXIT".equals(inputStr.trim())){
				System.out.println("��ӭ�´�����~");
				break;
			}
			char[] input = inputStr.toCharArray();
			int[] score = checkLetters(chs, input);
			if(score[1] == 5){
				System.out.println("��ϲ��ȫ�¶���~");
				break;
			}else{
				System.out.println("�¶�" + score[0] + "���ַ���" + score[1] + "���ַ�λ����ȷ");
			}
		}
		// �������ȷ���˳����������ȫ��ȷ�ͼ���
		scanner.close();
	}

	private static int[] checkLetters(char[] chs, char[] input) {
		int[] score = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(chs[i] == input[j]){
					score[0]++;
					if(i == j){
						score[1]++;
					}
				}
			}
		}
		return score;
	}

	/**
	 * @return ��������5������Ҳ��ظ����ַ�
	 */
	private static char[] generate() {
		// ��5������ģ��Ҳ��ظ����ַ�
		char[] chs = new char[5];

		// ׼��26���ַ�
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65 + i);
		}

		// ����һ��char���飬�ֱ��ÿ������ֵ
		for (int i = 0; i < chs.length; i++) {
			int index = generateRandomIndex(letters);
			if (i == 0) {
				chs[i] = letters[index];
			} else {
				// �ӵڶ����ַ���ʼ�жϣ���ǰ�������ַ��Ƿ���֮ǰ�������ַ����أ����ؾ���������������������ؾ͸�ֵ
				index = generateRandomIndex(letters);
				//
				// ����֮ǰ�������ַ������֮ǰ�������ַ����������ɵ��ַ����ظ����ͼ��������µ�������Ȼ��ѭ���жϣ�ֱ����ǰ�������ַ���֮ǰ�Ĳ��ظ�
				for (int j = 0; j < i; j++) {
					while (chs[j] == letters[index]) {
						index = generateRandomIndex(letters);
						// System.out.println(i); // ���ڲ����ĸ�λ�õ��ַ��ظ�
						// System.out.println(chs[j]); // ���ڼ���ظ����ַ���ʲô
					}
				}

				chs[i] = letters[index];
			}
			// ���������ĸ
		}

		return chs;
	}

	private static int generateRandomIndex(char[] letters) {
		return (int) (Math.random() * letters.length);
	}

}
