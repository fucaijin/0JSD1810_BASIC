package oo.day02;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("����","��ַ",18);
		student.sayHi();
		
		Student student2 = new Student("����", "��ַ");
		student2.sayHi();
		
		Student student3 = new Student("����");
		student3.sayHi();
	}
	
}
