package day06;

import java.util.Arrays;

/**
 * ð������
 * @author fucaijin
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
//		1.�����������(10����)�������
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random()*100);
		}
		
//		for (int i : arr) {
//			System.out.println(i);
//		}
		System.out.println(Arrays.toString(arr));
		
		
//		2.��ð������
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
		
//		3.�������֮�������
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		System.out.println();
		System.out.println();
		
//		�ڶ���
		int[] c = new int[10];
		for (int i = 0; i < c.length; i++) {
			c[i] = (int)(Math.random()*100);
		}
		
		System.out.println(Arrays.toString(c));
		
		for (int i = 0; i < c.length - 1 ; i++) {
			for (int j = 0; j < c.length - 1 -i; j++) {
				if (c[j] > c[j + 1]) {
					int t = c[j];
					c[j] = c[j + 1];
					c[j + 1]= t;
				}
			}
		}
		System.out.println(Arrays.toString(c));
		
		
		
	}

}
