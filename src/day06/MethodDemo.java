package day06;

public class MethodDemo {

	public static void main(String[] args) {
//		say();
//		sayHi("字符串");
//		sayHello("OKK", 99);
		double num = getDouble();
		int inteNum = getInt();
		String str = getStr();
		System.out.println(num);
		System.out.println(inteNum);
		System.out.println(str);
		
//		传递直接量给方法
		int a = plus(7, 8);
		System.out.println(a);
		
		int b = 9, c = 10;
		int d = plus(b, c);
		System.out.println(d);
	}
	
//	无参无返回值
	public static void say(){
		System.out.println("这是无参无返回值的方法");
	}
	
//	一参无返回值
	public static void sayHi(String name){
		System.out.println("String参数是：" + name);
	}
	
//	两参无返回值
	public static void sayHello(String name, int age){
		System.out.println("我是" + name + "，我今年" + age + "岁了");
		
	}
	
	public static double getDouble(){
		return 8.8;
	}
	
	public static int getInt(){
		return 565;
	}
	
	public static String getStr(){
		return "字符串";
	}
	
	public static int plus(int num1, int num2){
		return num1 + num2;
	}
	
}
