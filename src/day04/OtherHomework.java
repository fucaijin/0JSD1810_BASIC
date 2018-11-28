package day04;

import java.util.Scanner;

public class OtherHomework {

	public static void main(String[] args) {
//		1. 9，99，999，...，9999999999。要求使用程序计算此数列的和，并在控制台输出结果: 9+99+...+9999999999=?
		long a = 10;
		int times = 1;
		long result = 0;
		while (times<=10) {
			long tem;
			tem = a-1;
			if (times != 10) {
				System.out.print(tem + "+");
			}else{
				System.out.print(tem);
			}
			result += tem;
			a=a*10;
			times++;
		}
		System.out.println("=" + result);
		
//		个人所得税计算程序
		System.out.println("请输入你的工资的税前金额(￥)：");
		Scanner scanner = new Scanner(System.in);
		int pay = scanner.nextInt();

		pay = pay - 3500;
		
		double tax = 0;
		if(pay<=0){
			tax = 0;
		}else if (pay<=1500) {
			tax = pay * 0.03 - 0;
		} else if (pay<=4500) {
			tax = pay * 0.10 - 105;
		} else if (pay<=9000) {
			tax = pay * 0.20 - 555;
		} else if (pay<=35000) {
			tax = pay * 0.25 - 1005;
		} else if (pay<=55000) {
			tax = pay * 0.30 - 2755;
		} else if (pay<=80000) {
			tax = pay * 0.35 - 5505;
		} else {
			tax = pay * 0.45 - 13505;
		}
		System.out.println("你应该缴的个人所得税是：" + tax);
		
//		scanner.close();
		
//		输入年份和月份，输出该月的天数
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = scan.nextInt();
		System.out.println("请输入月份");
		int month = scan.nextInt();
		if(month>1 && month<13){
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(year + "年" + month +"月有31天");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println(year + "年" + month +"月有30天");
				break;
			case 2:
				if((year % 4 == 0) && (year % 100 != 0) || year%400 == 0){
					System.out.println(year + "年" + month +"月有29天");
				}else{
					System.out.println(year + "年" + month +"月有28天");
				}
				break;
			}
		}else{
			System.out.println("您输入的月份不正确");
		}
		scanner.close();
	}

}
