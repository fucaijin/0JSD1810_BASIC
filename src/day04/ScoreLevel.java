package day04;

import java.util.Scanner;

public class ScoreLevel {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ɼ���");
//
//		int score = scanner.nextInt();
//		if (score > 100 || score < 0) {
//			System.out.println("������ĳɼ����Ϸ�");
//		} else if (score >= 90) {
//			System.out.println("A - ���㣡");
//		} else if (score >= 80) {
//			System.out.println("B - ���ã�");
//		} else if (score >= 60) {
//			System.out.println("C - �ϸ�");
//		} else {
//			System.out.println("D - ���ϸ�");
//		}
//
//		if (score <= 100 && score >= 0) {
//			if (score >= 90) {
//				System.out.println("A - ���㣡");
//			} else if (score >= 80) {
//				System.out.println("B - ���ã�");				
//			} else if (score >= 60) {
//				System.out.println("C - �ϸ�");				
//			} else {
//				System.out.println("D - ���ϸ�");				
//			}
//		} else {
//			System.out.println("������ĳɼ����Ϸ�");
//		}
		
		
//		��ҵ��һ��
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("��������ĳɼ�");
//		int score = scanner.nextInt();
//		if (score > 100 || score < 0 ) {
//			System.out.println("����ĳɼ����Ϸ�");
//		} else if(score >= 90){
//			System.out.println("A-����");
//		}else if(score >= 80){
//			System.out.println("B-����");
//		}else if(score >= 60){
//			System.out.println("C-�ϸ�");
//		}else{
//			System.out.println("D-���ϸ�");
//		}
//		scanner.close();
		
//		��ҵ�ڶ���
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int score = scanner.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("����ĳɼ����Ϸ�");
		} else if (score >= 90) {
			System.out.println("A-����");
		} else if (score >= 80) {
			System.out.println("B-����");
		} else if (score >= 60) {
			System.out.println("C-�ϸ�");
		} else{
			System.out.println("������");
		}
		scanner.close();

	}

}
