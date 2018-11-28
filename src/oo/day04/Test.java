package oo.day04;

public class Test {

	public static void main(String[] args) {
		Person[] person = new Person[6];
		person[0] = new Student("ѧ��1",25,"����",111);
		person[1] = new Student("ѧ��2",27,"�ӱ�",111);
		person[2] = new Techer("��ʦ1",30,"����",888);
		person[3] = new Techer("��ʦ2",33,"����",999);
		person[4] = new Doctor("ҽ��1",36,"����","����");
		person[5] = new Doctor("ҽ��2",39,"����","������");
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
		System.out.println("����" + name +",��" + age + "���ˣ��ҵĵ�ַ��" + address);
	}
}

class Student extends Person{
	int studentId;
	Student(String name, int age, String address, int studentId){
		super(name,age,address);
		this.studentId = studentId;
	}
	
	void sayHi(){
		System.out.println("����" + name +",��" + age + "���ˣ��ҵĵ�ַ��" + address + ",�ҵ�ѧ����" + studentId);
	}
	
}

class Techer extends Person{
	double salary;
	Techer(String name, int age, String address, double salary){
		super(name, age, address);
		this.salary = salary;
	}
	
	void sayHi(){
		System.out.println("����" + name +",��" + age + "���ˣ��ҵĵ�ַ��" + address + ",�ҵĹ�����" + salary);
	}
}

class Doctor extends Person{
	String level;
	Doctor(String name, int age, String address, String level) {
		super(name, age, address);
		this.level = level;
	}
}
