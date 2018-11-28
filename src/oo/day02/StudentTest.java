package oo.day02;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student("张三","地址",18);
		student.sayHi();
		
		Student student2 = new Student("王五", "地址");
		student2.sayHi();
		
		Student student3 = new Student("老六");
		student3.sayHi();
	}
	
}
