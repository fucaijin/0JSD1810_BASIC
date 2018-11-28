package oo.day01;

public class Student {
	String name;
	String address;
	int age;
	
	void study(){
		System.out.println(name + "在学习");
	}
	
	void sayHi(){
		System.out.println("大家好，我叫" + name + "今年" + age + "岁了，我住在" + address);
	}
	
}
