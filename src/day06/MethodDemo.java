package day06;

public class MethodDemo {

	public static void main(String[] args) {
//		say();
//		sayHi("�ַ���");
//		sayHello("OKK", 99);
		double num = getDouble();
		int inteNum = getInt();
		String str = getStr();
		System.out.println(num);
		System.out.println(inteNum);
		System.out.println(str);
		
//		����ֱ����������
		int a = plus(7, 8);
		System.out.println(a);
		
		int b = 9, c = 10;
		int d = plus(b, c);
		System.out.println(d);
	}
	
//	�޲��޷���ֵ
	public static void say(){
		System.out.println("�����޲��޷���ֵ�ķ���");
	}
	
//	һ���޷���ֵ
	public static void sayHi(String name){
		System.out.println("String�����ǣ�" + name);
	}
	
//	�����޷���ֵ
	public static void sayHello(String name, int age){
		System.out.println("����" + name + "���ҽ���" + age + "����");
		
	}
	
	public static double getDouble(){
		return 8.8;
	}
	
	public static int getInt(){
		return 565;
	}
	
	public static String getStr(){
		return "�ַ���";
	}
	
	public static int plus(int num1, int num2){
		return num1 + num2;
	}
	
}
