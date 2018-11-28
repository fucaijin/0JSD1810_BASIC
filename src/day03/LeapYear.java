package day03;

import java.util.Scanner;

/**
 * 接受年份并输出，判断是否是闰年
 */
public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scanner.nextInt();
		System.out.println("您输入的年份是:" + year);

		boolean flag = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		String result = flag ? year + "是闰年" : year + "不是闰年";
		System.out.println(result);
	}

}
