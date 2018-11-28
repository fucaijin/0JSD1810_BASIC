package oo.day04;

public class OverloadOverrideDemo {

	public static void main(String[] args) {
		// 重载看参数类型，重写看对象类型
		Goo goo =  new Goo();
		Eoo foo = new Foo();
//		Foo eoo = new Foo();
		goo.test(foo);
//		goo.test(eoo);
	}

}

class Goo{
	void test(Eoo eoo){
		System.out.println("超类型参数");
		eoo.show();
	}
	
	void test(Foo foo){
		System.out.println("派生类型参数");
		foo.show();
	}
}

class Eoo{
	void show(){
		System.out.println("超类show");
	}
}

class Foo extends Eoo{
	void show(){
		System.out.println("派生类show");
	}
	
}