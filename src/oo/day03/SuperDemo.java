package oo.day03;

public class SuperDemo {

	public static void main(String[] args) {
		Xoo xoo = new Xoo();
		xoo.test(9);
	}
	
}

class Foo{
	int a = 6;
}

class Xoo extends Foo{
	int a = 5;
	void test(int a){
		System.out.println("a = " + a + ", this.a = " + this.a + 
				", super.a = " + super.a);  
		// a = �������Ĳ����� this.a = ����ı��� super.a ���Ǹ���ı���
	}
}