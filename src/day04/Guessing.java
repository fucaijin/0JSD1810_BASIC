package day04;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		int number = (int) (Math.random() * 1000 + 1);
//		System.out.println(number);
//		System.out.println("�²�����˭��������������");
//
//		int guessNumber;
//		do {
//			guessNumber = scanner.nextInt();
//			if (guessNumber == 0) {
//				break;
//			}
//
//			if (guessNumber > number) {
//				System.out.println("���������̫����");
//			} else if (guessNumber < number) {
//				System.out.println("���������̫С��");
//			}
//
//		} while (guessNumber != number);
//
//		if (guessNumber == number) {
//			System.out.println("��ϲ��¶���~");
//		} else {
//			System.out.println("�´�������ѽ");
//		}
//
//		/*
//		 * System.out.println("�²�����˭��������������"); int guessNumber =
//		 * scanner.nextInt();
//		 * 
//		 * while(guessNumber != number){ if (guessNumber == 0) { break; }
//		 * 
//		 * System.out.print("���Բ��ԣ������£�"); if (guessNumber>number) {
//		 * System.out.println("���������̫����"); }else{
//		 * System.out.println("���������̫С��"); } guessNumber = scanner.nextInt(); }
//		 * 
//		 * 
//		 * if(guessNumber == number){ System.out.println("��ϲ��¶���~"); }else{
//		 * System.out.println("�´�������ѽ ^_^"); }
//		 * 
//		 */
//		scanner.close();
		
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		
//		������֮While
//		System.out.println("������µ�����");
//		int guessNum = scanner.nextInt();
//		while(num != guessNum){
//			if (guessNum == 0) {
//				break;
//			}
//			
//			System.out.print("û�¶ԣ�");
//			if(guessNum>num){
//				System.out.println("�´���");
//			}else {
//				System.out.println("��С��");
//			}
//			
//			System.out.println("������");
//			guessNum = scanner.nextInt();
//		}
//		
//		if(guessNum==0){
//			System.out.println("��ӭ�´μ���");
//		}else {
//			System.out.println("��ϲ��¶���");
//		}
		
//		������֮do While ��һ��
//		int inputNum;
//		do{
//			System.out.println("��������µ�����");
//			inputNum = scanner.nextInt();
//			
//			if(inputNum == 0){
//				break;
//			}
//			
//			if(inputNum > num){
//				System.out.println("�´���");
//			}else if(inputNum < num){
//				System.out.println("��С��");
//			}
//		}while(inputNum != num);
//		
//		if(inputNum == 0){
//			System.out.println("��ӭ�´�����");
//		}else{
//			System.out.println("��ϲ��¶���");
//		}
		
		
		
//		������֮do While �ڶ���
		int guessNum;
		do{
			System.out.println("��������µ�����");
			guessNum = scanner.nextInt();
		
			if (guessNum == 0) {
				break;
			}
			if (guessNum > num) {
				System.out.println("�´���");
			}else if(guessNum < num){
				System.out.println("��С��");
			}
		}while(guessNum != num);
		
		if (guessNum == 0) {
			System.out.println("��ӭ�´β���");
		} else {
			System.out.println("��ϲ��¶���");
		}
		
		
		scanner.close();
	}

}
