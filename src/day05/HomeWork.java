package day05;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// ����ӷ������� ��һ��
//		Scanner scanner = new Scanner(System.in);
//		int score = 0;
//		for (int i = 1; i <= 10; i++) {
//			int a = (int) (Math.random() * 100);
//			int b = (int) (Math.random() * 100);
//			System.out.println("(" + i + ") " + a + " + " + b + "=?");
//			System.out.println("�°�");
//			int c = scanner.nextInt();
//			if (c == -1) {
//				break;
//			}
//			if (c == a + b) {
//				System.out.println("�¶�����+10��");
//				score += 10;
//			} else {
//				System.out.println("û�¶ԣ����ӻ�");
//			}
//		}
//		scanner.close();
//		System.out.println("��ĵ÷��ǣ�" + score);
//
//		// ����ӷ������� �ڶ���
//		Scanner scanner2 = new Scanner(System.in);
//
//		int score2 = 0;
//		for (int i = 1; i <= 10; i++) {
//			int a = (int) (Math.random() * 100);
//			int b = (int) (Math.random() * 100);
//			System.out.println("(" + i + ")" + a + "+" + b + " = ?");
//			System.out.println("�°�");
//
//			int input = scanner2.nextInt();
//
//			if (input == -1) {
//				break;
//			}
//
//			if (input == a + b) {
//				System.out.println("��ϲ��������+10��");
//				score2 += 10;
//			} else {
//				System.out.println("û���");
//			}
//		}
//		System.out.println("��ĵ÷�Ϊ��" + score2);
//		scanner2.close();

		// 9*9�˷��� ��һ��
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + j * i + "\t");
			}
			System.out.println();
		}

		// 9*9�˷��� �ڶ���
		for(int j = 1; j <= 9; j++){
			for(int i = 1; i <= j; i++){
				System.out.print(i + "*" + j + "=" + j*i + "\t");
			}
			System.out.println();
		}

		// max value of array ��һ��
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		System.out.println("arr = " + Arrays.toString(arr));
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		
		
//		����9��99��999��...��9999999999�ĺ�sum = 11111111100
		long sum = 0;
		long num = 1;
		for(int i = 1;i <= 10;i++){
			num *= 10;
			sum +=num - 1;
		}
		System.out.println("sum = " + sum);
		
		
		
//		����1+1/2+1/3��+1/n��n>=2��
		Scanner scanner = new Scanner(System.in);
		double dSum = 0;
		System.out.println("������������");
		int input = scanner.nextInt();
		for(int i = 1; i <= input; i++){
			dSum += 1.0/i;
		}
		System.out.println("1+1/2+1/3��+1/"+ input +"�Ľ��Ϊ: " + dSum);
		scanner.close();
		
	}

}
