package day05;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.println(arr[i]);
		}
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		System.out.println("min = " + min);
		
		Arrays.sort(arr);
		
		int[] newArr = Arrays.copyOf(arr, arr.length); 
		
		for (int i = 0; i < newArr.length; i++) {
			arr[arr.length-1-i] = newArr[i];
		}
		System.out.println();
		System.out.println(Arrays.toString(newArr));
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr);
//		System.out.println("max = " + arr[arr.length-1]);
//		System.out.println("min = " + arr[0]);
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
//		µÚ¶þ´Î
		int[] b = new int[10];
		for(int i = 0; i < b.length; i++){
			b[i] = (int) (Math.random()*100);
			System.out.println(b[i]);
		}
		
		int max2 = b[0];
		for(int i = 1; i < b.length; i++){
			if(b[i]>max2){
				max2 = b[i];
			}
		}
		System.out.println("max2 = " + max2);
	}

}
