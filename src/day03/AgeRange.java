package day03;

import java.util.Scanner;

/**
 * 接受用户输入的年龄并输出
 */
public class AgeRange {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄:");
		int age = scanner.nextInt();
		System.out.println(age >= 18 && age <= 50);
		*/
		
		/*
		
//		&& || 各4组 !两组
//		关系运算符6个符号都用 
//		> < == != >= <=
//		短路
		
		int a = 3, b = 9, c = 3;
		
		System.out.println(a > 2 && c < 2);	// true && false => false
		System.out.println(b == 9 && c != 5);	// true && true => true
		System.out.println(a >= 4 && b <= c);	// false && true => false
		System.out.println(a > c && b <= c);	// false && false => false
		
		System.out.println(a > 2 || c < b);	// true || false => true
		System.out.println(b == 9 || c != b);	// true || true => true
		System.out.println(a >= b || b <= 9);	// false || true => true
		System.out.println(a > c || b <= c);	// false || false => false
		
		System.out.println(!(a==3));//!true => false
		System.out.println(!(a>3));	//!false => true
		
		System.out.println(b < c && a++ <= b);//false
		System.out.println(a <= b || --b > c);//true
		System.out.println(a);
		System.out.println(b);
		
		
		 */
		
		int a = 5;
		a += 20;
		System.out.println(a);//25
		a *= 4;
		System.out.println(a);//100
		a /= 10;
		System.out.println(a);//10
		
		int age = 37;
		System.out.println("age = " + age); //age = 37
		System.out.println("我的年龄是" + age); //我的年龄是37
		System.out.println("我今年" + age + "岁了"); //我今年37岁了
		
		System.out.println(10 + 20 + "" + 30); //3030
		System.out.println("" + 10 + 20 + 30); //102030
		System.out.println(10 + 20 + 30 + ""); //60
		
		int b = 8, c = 5;
		int max = b>c ? b : c;
		System.out.println("max = " + max);//8
		
		
		
	}

}
