package oo.day01;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "符才锦";
		st1.age = 27;
		st1.address = "海口万国大都会";
		st1.study();
		st1.sayHi();
		System.out.println();
		
		Student st2 = new Student();
		st2.name = "王五";
		st2.age = 18;
		st2.address = "某个角落";
		st2.study();
		st2.sayHi();
		System.out.println();

		Student st3 = new Student();
		st3.name = "初八";
		st3.address = "火星";
		st3.study();
		st3.sayHi();
		System.out.println();

	}
	
}
