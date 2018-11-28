package oo.day03;

public class ArrayDemo {
	public static void main(String[] args) {
		AirPlane[] airArr = new AirPlane[5];
		for (int i = 0; i < airArr.length; i++) {
			System.out.println(airArr[i]);
		}
		
		System.out.println();
		
		airArr[0] = new AirPlane();
		airArr[2] = new AirPlane();
		for (int i = 0; i < airArr.length; i++) {
			System.out.println(airArr[i]);
		}
	}
	
}

class AirPlane{
	
}
