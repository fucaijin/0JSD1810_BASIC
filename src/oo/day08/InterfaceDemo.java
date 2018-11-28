package oo.day08;

public class InterfaceDemo {

	public static void main(String[] args) {
//		Inter4 o1 = new Inter4();	//接口不能实例化
		Inter4 o2 = new Eoo();	//向父类造型
		Inter3 o3 = new Eoo();	//向爷类造型
	}

}

interface Inter1{
	public static final double PI = 3.1415;
	void show();
}

interface Inter2{
	public void a();
	public void b();
}

class Aoo implements Inter2{
	public void a(){
		
	}
	
	public void b(){
		
	}
}

interface Inter3{
	void c();
}

class Boo implements Inter2, Inter3{
	public void a(){}
	public void b(){}
	public void c(){}
}

abstract class Coo {
	public abstract void d();
}

class Doo extends Coo implements Inter2, Inter3{
	public void a(){};
	public void b(){};
	public void c(){};
	public void d(){};
}

interface Inter4 extends Inter3{
	void e();
}

class Eoo implements Inter4{
	public void e(){}
	public void c(){}
}