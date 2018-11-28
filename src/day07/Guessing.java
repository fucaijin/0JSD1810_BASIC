package day07;

import java.util.Scanner;

/**
 * ���ַ���Ϸ
 * @author fucaijin
 *
 */
public class Guessing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] chs = generate();
		int falseTimes = 0;
		System.out.println(chs);
		while (true) {
			System.out.println("�°ɣ�");
			String inputStr = scanner.nextLine().toUpperCase();
			if (inputStr.equals("EXIT")) {
				System.out.println("��ӭ�´�������");
				break;
			}
			char[] input = inputStr.toCharArray();
			int[] result = check(chs, input);
			if(result[0] == chs.length){
				int score = 100*chs.length - 10*falseTimes;
				System.out.println("��ϲ��¶���,�÷�Ϊ��" + score);
				break;
			}else{
				falseTimes++;
				System.out.println("û�¶ԣ��¶��ַ�����Ϊ��" + result[1] + "���¶��ַ�λ�ø���Ϊ" + result[0]);
			}
		}
		scanner.close();
	}

	// ��������ַ�����chs
	public static char[] generate() {
		char[] chs = new char[5];
//		����������ַ�
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		boolean[] used = new boolean[letters.length];
		
		for (int i = 0; i < chs.length; i++) {					// ����Ҫ���ɵ��ַ������飬��������ַ�
			int index;
			do{
				index = (int)(Math.random()*letters.length); 	// ���������26��ĸ�ڵ�	����
			}while(used[index] == true);						// �ж������Ƿ��б��ù�������ù���ѭ����������
			chs[i] = letters[index];							// �������ɵ����������ȡ����ַ�����ֵ���洢�ַ�������
			used[index] = true;
		}
		
		// i=0	index=5 	chs[0]='F'	use[5]=true
		// i=1	index=2 	chs[1]='C'	use[2]=true
		// i=2	index=5/2/3 chs[2]='D'	use[3]=true
		// i=3	index=15	chs[3]='P'	use[15]=true
		// i=4	index=21	chs[4]='V'	use[21]=true
		
		
		return chs;
	}

	// �Ա�:����ַ�����chs���û�������ַ�����input
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];	//�ԱȽ��
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[1]++;//�ַ���ȷ����
					if(i == j){
						result[0]++;//λ����ȷ����
					}
					break;
				}
			}
		}
		
		return result;
	}
	
}
