package oo.day04;

public class UploadDemo {

	public static void main(String[] args) {
		Aoo o1 = new Aoo();
		o1.a = 1;
		o1.method1();
		
		Boo o2 = new Boo();
		o2.a = 2;
		o2.b = 3;
		o2.method1();
		o2.method2();
		
		Aoo o3 = new Boo();
		o3.a = 1;
		o3.method1();
//		c.b;//±¨´í
//		c.method2();//±¨´í

	}

}

class Aoo {
	int a;

	void method1() {

	}
}

class Boo extends Aoo {
	int b;

	void method2() {

	}
}
