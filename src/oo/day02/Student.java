package oo.day02;

public class Student {
	String name;
	String address;
	int age;

	Student(String name, String address, int age) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	Student(String name, String address){
		this(name, address, 0);
	}
	
	Student(String name){
		this(name, null, 0);
	}

	void study() {
		System.out.println(name + "��ѧϰ");
	}

	void sayHi() {
		System.out.println("��Һã��ҽ�" + name + "����" + age + "���ˣ���ס��" + address);
	}

}
