package day05;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = {1, 4, 7, 9};
		int[] arr3 = new int[]{1, 4, 7, 9};
//		int[] arr3;
//		arr3 = new int[]{1, 4, 7, 9};
		
		int[] arr = new int[3];
		System.out.println("arr.length = " + arr.length);
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
//		arr[3] = 400;
		System.out.println("arr last value = " + arr[arr.length-1]);
	}

}
