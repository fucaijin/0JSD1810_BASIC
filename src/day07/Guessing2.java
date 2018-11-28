package day07;

import java.util.Scanner;

public class Guessing2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��ӭ������");
//		����һ������Ĳ��ظ���5���ַ����ȵ�����
		char[] chs = generateLetter();
		System.out.println(chs);
		
		int falseTimes = 0;
		while (true) {
			System.out.println("�°ɣ�");
			String inputStr = scanner.nextLine().toUpperCase(); 
			if("EXIT".equals(inputStr)){
				System.out.println("��ӭ�´�������");
				break;
			}
			char[] inputCharArray = inputStr.toCharArray();
			int[] result = check(chs, inputCharArray);
			if(result[1] == chs.length){
				System.out.println("��ϲ��¶������÷�Ϊ��" + (100*chs.length - 10*falseTimes));
				break;
			}else{
				System.out.println("�¶��ַ�Ϊ��" + result[0] + ",�¶�λ�ø���Ϊ" + result[1]);
				falseTimes++;
			}
		}
		
		scanner.close();

	}

	/**
	 * �Ա��������飬�����ضԱȽ��
	 * @param inputCharArray 
	 * @param chs 
	 * @return ���ضԱȵĽ��
	 */
	private static int[] check(char[] chs, char[] inputCharArray) {
		int[] result = new int[2];	// [0, 1] 0Ϊ��ȷ���ַ�������1Ϊλ����ȷ�Ĵ���
//		������char�е�ÿ���ַ��ֱ���бȽ�
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < inputCharArray.length; j++) {
//				������ַ���ȣ��ͼ���ȷ���ַ����������ж�λ���Ƿ���ȣ����Ҳ��Ⱦͼ���ȷ��λ�ô���
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

	/**
	 * @return �������ɵ�����ַ����飬5���ַ����Ҳ����ظ���A-Z
	 */
	private static char[] generateLetter() {
//		char[] chs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
//				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//		׼����Ž����char����
		char[] chs = new char[5];
//		׼��26����ĸ
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65+i);
		}
//		׼���������
		boolean[] used = new boolean[letters.length];
		
//		��������Ĳ��ظ���5��char����
		for (int i = 0; i < chs.length; i++) {
			int index;
//			�����������ĸ�����������������ǹ����������
			do{
				index = (int) (Math.random()*letters.length);
			}while(used[index] == true);
			
//			�������û����ǹ�����ʹ������ȡ�ַ���Ȼ����������б����ʹ�ù�
			chs[i] = letters[index];
			used[index] = true;
		}
		
		return chs;
	}

}
