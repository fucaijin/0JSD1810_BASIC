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
		System.out.println(name + "在学习");
	}

	void sayHi() {
		System.out.println("大家好，我叫" + name + "今年" + age + "岁了，我住在" + address);
	}

}
