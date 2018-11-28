package day03;

import java.util.Scanner;

public class HomeWork {
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// 1.AgeRange�����жϳ���
		// 2.LeapYear�����жϳ���
		// 3.Cashier��̨��������
		adjudgeAgeRange();
		adjudgeLeapYear();
		cashier();
		othersHomeWork();
	}

	/**
	 * �ж����䷶Χ
	 */
	private static void adjudgeAgeRange() {
		System.out.println("����������");
		int age = scanner.nextInt();
		System.out.println("����Ϊ��" + age);

	}

	/**
	 * �ж��Ƿ�����
	 */
	private static void adjudgeLeapYear() {
		System.out.println("���������");
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "������");
		} else {
			System.out.println(year + "��������");
		}
	}

	/**
	 * ����̨
	 */
	private static void cashier() {
		System.out.println("�����뵥��:");
		double price = scanner.nextDouble();

		System.out.println("����������:");
		double amount = scanner.nextDouble();

		double totalPrice = price * amount;

//		�ж��Ƿ�ﵽ����
		if (totalPrice >= 500) {
			double rawPrice = totalPrice;
			totalPrice *= 0.8;
			System.out.println("���Ĺ����ܼ۴ﵽ500,������8��,ԭ��Ϊ" + rawPrice + ",�ۺ�۸�Ϊ��" + totalPrice);
		}

//		���Ӧ���˿�
		System.out.println("Ӧ�տ" + totalPrice + "Ԫ");
		
//		�жϸ����Ƿ��㹻
		System.out.println("��������ȡ���:");
		double payMoney = scanner.nextDouble();
		if (payMoney >= totalPrice) {
			System.out.println("���㣺" + (payMoney - totalPrice) + "Ԫ");
		} else {
			System.out.println("����������֧��" + (totalPrice - payMoney) + "Ԫ,���򱨾�������");
		}

	}

	/**
	 * 1.���������  + - * / % ++ --
	 * 2.��ϵ(> < >= <= == !=)���߼������(& | && || !)
	 * 3.��ֵ(+= -= *= /= %=)���ַ������ӡ���Ŀ�����
	 */
	private static void othersHomeWork() {
//		���������
		int a = 9;
		System.out.println(a + 1);	//10
		System.out.println(a - 1);	//8
		System.out.println(a * 3);	//27
		System.out.println(a / 3);	//3
		System.out.println(a % 2);	//1
		System.out.println(a++);	//9
		System.out.println(a--);	//10
		
//		��ϵ�����
		int b = 6;
		System.out.println(a > b);	//true
		System.out.println(a < b);	//false
		System.out.println(a >= b);	//true
		System.out.println(a <= b);	//false
		System.out.println(a == b);	//false
		System.out.println(a != b);	//true
		
//		�߼������(&&)
		int c = 6;
		System.out.println(a>b && a>c);	//true && true => true
		System.out.println(a<b && a>c);	//false && true => false
		System.out.println(a>b && a<c);	//true && false => false
		System.out.println(a<b && a<c);	//false && false => false
		
//		�߼������(||)
		System.out.println(a>b || a>c);	//true || true => true
		System.out.println(a<b || a>c);	//false || true => true
		System.out.println(a>b || a<c);	//true || false => true
		System.out.println(a<b || a<c);	//false || false => false
		
//		�߼������(!)
		System.out.println(!(a>b));	//!true => false
		System.out.println(!(a<b));	//!false => true
		
//		��ֵ�����
		System.out.println(a+=1);	//10
		System.out.println(a-=1);	//9
		System.out.println(a*=2);	//18
		System.out.println(a/=3);	//6
		System.out.println(a%=2);	//0
		
//		�ַ�������
		System.out.println(a+b+"c");	//6c
		System.out.println(a+"c"+b);	//0c6
		System.out.println("c"+a+b);	//c06
		
//		��Ŀ�����
		System.out.println("ab�����ֵΪ��" + (a>b?a:b));	//ab�����ֵΪ��6
	}
}
