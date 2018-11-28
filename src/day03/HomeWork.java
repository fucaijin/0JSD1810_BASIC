package day03;

import java.util.Scanner;

public class HomeWork {
	static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		// 1.AgeRange年龄判断程序
		// 2.LeapYear闰年判断程序
		// 3.Cashier柜台收银程序
		adjudgeAgeRange();
		adjudgeLeapYear();
		cashier();
		othersHomeWork();
	}

	/**
	 * 判断年龄范围
	 */
	private static void adjudgeAgeRange() {
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		System.out.println("年龄为：" + age);

	}

	/**
	 * 判断是否闰年
	 */
	private static void adjudgeLeapYear() {
		System.out.println("请输入年份");
		int year = scanner.nextInt();
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "是闰年");
		} else {
			System.out.println(year + "不是闰年");
		}
	}

	/**
	 * 收银台
	 */
	private static void cashier() {
		System.out.println("请输入单价:");
		double price = scanner.nextDouble();

		System.out.println("请输入数量:");
		double amount = scanner.nextDouble();

		double totalPrice = price * amount;

//		判断是否达到活动金额
		if (totalPrice >= 500) {
			double rawPrice = totalPrice;
			totalPrice *= 0.8;
			System.out.println("您的购物总价达到500,给您打8折,原价为" + rawPrice + ",折后价格为：" + totalPrice);
		}

//		输出应收账款
		System.out.println("应收款：" + totalPrice + "元");
		
//		判断付款是否足够
		System.out.println("请输入收取金额:");
		double payMoney = scanner.nextDouble();
		if (payMoney >= totalPrice) {
			System.out.println("找零：" + (payMoney - totalPrice) + "元");
		} else {
			System.out.println("金额不够，还需支付" + (totalPrice - payMoney) + "元,否则报警揍死你");
		}

	}

	/**
	 * 1.算数运算符  + - * / % ++ --
	 * 2.关系(> < >= <= == !=)、逻辑运算符(& | && || !)
	 * 3.赋值(+= -= *= /= %=)、字符串连接、三目运算符
	 */
	private static void othersHomeWork() {
//		算数运算符
		int a = 9;
		System.out.println(a + 1);	//10
		System.out.println(a - 1);	//8
		System.out.println(a * 3);	//27
		System.out.println(a / 3);	//3
		System.out.println(a % 2);	//1
		System.out.println(a++);	//9
		System.out.println(a--);	//10
		
//		关系运算符
		int b = 6;
		System.out.println(a > b);	//true
		System.out.println(a < b);	//false
		System.out.println(a >= b);	//true
		System.out.println(a <= b);	//false
		System.out.println(a == b);	//false
		System.out.println(a != b);	//true
		
//		逻辑运算符(&&)
		int c = 6;
		System.out.println(a>b && a>c);	//true && true => true
		System.out.println(a<b && a>c);	//false && true => false
		System.out.println(a>b && a<c);	//true && false => false
		System.out.println(a<b && a<c);	//false && false => false
		
//		逻辑运算符(||)
		System.out.println(a>b || a>c);	//true || true => true
		System.out.println(a<b || a>c);	//false || true => true
		System.out.println(a>b || a<c);	//true || false => true
		System.out.println(a<b || a<c);	//false || false => false
		
//		逻辑运算符(!)
		System.out.println(!(a>b));	//!true => false
		System.out.println(!(a<b));	//!false => true
		
//		赋值运算符
		System.out.println(a+=1);	//10
		System.out.println(a-=1);	//9
		System.out.println(a*=2);	//18
		System.out.println(a/=3);	//6
		System.out.println(a%=2);	//0
		
//		字符串连接
		System.out.println(a+b+"c");	//6c
		System.out.println(a+"c"+b);	//0c6
		System.out.println("c"+a+b);	//c06
		
//		三目运算符
		System.out.println("ab的最大值为：" + (a>b?a:b));	//ab的最大值为：6
	}
}
