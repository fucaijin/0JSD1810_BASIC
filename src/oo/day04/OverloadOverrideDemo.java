package oo.day04;

public class OverloadOverrideDemo {

	public static void main(String[] args) {
		// ���ؿ��������ͣ���д����������
		Goo goo =  new Goo();
		Eoo foo = new Foo();
//		Foo eoo = new Foo();
		goo.test(foo);
//		goo.test(eoo);
	}

}

class Goo{
	void test(Eoo eoo){
		System.out.println("�����Ͳ���");
		eoo.show();
	}
	
	void test(Foo foo){
		System.out.println("�������Ͳ���");
		foo.show();
	}
}

class Eoo{
	void show(){
		System.out.println("����show");
	}
}

class Foo extends Eoo{
	void show(){
		System.out.println("������show");
	}
	
}