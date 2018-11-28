package oo.day02;

public class NullRefDemo {

	public static void main(String[] args) {
		Student zs = new Student("ÕÔËÄ");
		System.out.println(zs.name);
		zs = null;
//		System.out.println(zs.name);	// ¿ÕÖ¸ÕëÒì³£
		
		Student ls = new Student("wangwu");
		Student lss = ls;
		lss.age = 25;
		System.out.println(ls.age);	// 25
		
		int a = 5;
		int b = a;
		b = 8;
		System.out.println(a);	// 5
	}

}
