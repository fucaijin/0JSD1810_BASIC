package day04;

import java.util.Scanner;

/**
 * �����û��������������
 */
public class CommandBySwitch {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼ 2.��ѯ��½��¼ 0.�˳�");
//		int command = scanner.nextInt();
//		
//		switch (command) {
//		case 1:
//			System.out.println("��ʾȫ����¼");
//			break;
//		case 2:
//			System.out.println("��ѯ��½��¼");
//			break;
//		case 0:
//			System.out.println("��ӭ�´�����");
//			break;
//		}
//		
//		if (command == 1) {
//			System.out.println("��ʾȫ����¼");
//		} else if(command == 2){
//			System.out.println("��ѯ��½��¼");
//		} else if(command == 0){
//			System.out.println("��ӭ�´�����");
//		} else{
//			System.out.println("�������");
//		}
		
//		��һ����ҵ
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼ 2.��ѯ��½��¼ 0.�˳�");
//		int choiceFun = scanner.nextInt();
//		switch (choiceFun) {
//		case 1:
//			System.out.println("��ʾȫ����¼");
//			break;
//		case 2:
//			System.out.println("��ѯ��½��¼");
//			break;
//		case 0:
//			System.out.println("�����˳�����ӭ�´�����");
//			break;
//		}
//		scanner.close();
		
//		�ڶ�����ҵ
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ���ܣ�1.��ʾȫ����¼ 2.��ѯ��½��¼ 0.�˳�");
		int choiceFun = scanner.nextInt();
		switch (choiceFun) {
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��½��¼");
			break;
		case 0:
			System.out.println("���˳�����ӭ�´�����");
			break;
		}
		scanner.close();
	}

}
