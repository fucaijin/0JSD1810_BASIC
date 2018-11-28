package day06;

import java.util.Arrays;

public class MaxOfArray {

	public static void main(String[] args) {
		// max value of array 第二次
//		随机生成10个数，放入到一个int数组，然后求出最大的数，并输出
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
		System.out.println("arr = " + Arrays.toString(arr));
		
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max){
				max = arr[i];
			}
		}
		System.out.println("max = " + max);
		
		arr = Arrays.copyOf(arr, arr.length+1);
		arr[arr.length-1] = max;
		System.out.println("new arr = " + Arrays.toString(arr));
		
		int[] a = {1, 3, 5, 7, 9};
		int[] b = new int[10];
		
		System.arraycopy(a, 1, b, 2, 2);
		System.out.println("arrB = " + Arrays.toString(b));
		
		int[] c = {2, 4, 6, 8, 10};
		int[] d = new int[8];
		System.arraycopy(c, 1, d, 5, 3);
		System.out.println("arrD = " + Arrays.toString(d));
		
	}

}
