package day02;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DataTypeDemo {

	public static void main(String[] args) {
		/*a
		
		int a = 250;
//		int b = 10000000000;	//直接量超出了int范围
		System.out.println(5/2);
		System.out.println(2/5);
		System.out.println(5/2.0);
		int c = 2147483647;
		c = c + 1;
		System.out.println(c);
		
		long d = 10000000000L;
		long e = 1000000000*2*10L;
		System.out.println(e);
		long f = 1000000000*3*10L;
		System.out.println(f);
		long g = 1000000000L*3*10;
		System.out.println(g);
		long h = System.currentTimeMillis();
		System.out.println(h);
		
		double pi = 3.14159;
		double i = 6.0, j = 4.9;
		System.out.println(i - j);
		
		*/
		
		
		/*
		 
		boolean b1 = true;
		boolean b2 = false;
//		boolean b3 = 36;	//赋值类型错误
		
		char c1 = '男';
		char c2 = 'm';
		char c3 = '6';
		char c4 = ' ';
//		char c5 = '';		//不能为空字符
//		char c6 = '男性';		//只能有一个字符
		char c7 = 97;
		System.out.println(c7);
		
		char c8 = '\'';
		System.out.println(c8);
		
		*/
		
		int a = 5;
		long b = a;
		int c = (int) b;
		
		long d = 10000000000L;
		int e = (int)d;
		System.out.println("e = " + e);
		
		double f = 25.989;
		int g = (int)f;
		System.out.println("g = " + g);
		
		byte b1 = 5;
		byte b2 = 6;
		byte b3 = (byte)(b1 + b2);
		
		System.out.println(2 + 2);
		System.out.println('2' + '2');
	}

}
