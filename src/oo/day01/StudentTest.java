package oo.day01;

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "���Ž�";
		st1.age = 27;
		st1.address = "��������󶼻�";
		st1.study();
		st1.sayHi();
		System.out.println();
		
		Student st2 = new Student();
		st2.name = "����";
		st2.age = 18;
		st2.address = "ĳ������";
		st2.study();
		st2.sayHi();
		System.out.println();

		Student st3 = new Student();
		st3.name = "����";
		st3.address = "����";
		st3.study();
		st3.sayHi();
		System.out.println();

	}
	
}
