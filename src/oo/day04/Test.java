package oo.day04;

public class Test {

	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Student("学生1",25,"北京",111);
		person[1] = new Student("学生2",27,"河北",111);
		person[2] = new Techer("老师1",30,"河南",888);
		person[3] = new Techer("老师2",33,"湖北",999);
		person[4] = new Doctor("医生1",36,"湖南","主任");
		person[5] = new Doctor("医生2",39,"海南","副主任");
		for (int i = 0; i < person.length; i++) {
			person[i].sayHi();
		}
		
	}

}

class Person {
	String name;
	int age;
	String address;

	Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void sayHi(){
		System.out.println("我是" + name +",我" + age + "岁了，我的地址是" + address);
	}
}

class Student extends Person{
	int studentId;
	Student(String name, int age, String address, int studentId){
		super(name,age,address);
		this.studentId = studentId;
	}
	
	void sayHi(){
		System.out.println("我是" + name +",我" + age + "岁了，我的地址是" + address + ",我的学号是" + studentId);
	}
	
}

class Techer extends Person{
	double salary;
	Techer(String name, int age, String address, double salary){
		super(name, age, address);
		this.salary = salary;
	}
	
	void sayHi(){
		System.out.println("我是" + name +",我" + age + "岁了，我的地址是" + address + ",我的工资是" + salary);
	}
}

class Doctor extends Person{
	String level;
	Doctor(String name, int age, String address, String level) {
		super(name, age, address);
		this.level = level;
	}
}
