package day03;

import java.util.Scanner;

/**
 * ������ݲ�������ж��Ƿ�������
 */
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������:");
		int year = scanner.nextInt();
		System.out.println("������������:" + year);

		boolean flag = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String result = flag ? year + "������" : year + "��������";
		System.out.println(result);
	}

}
