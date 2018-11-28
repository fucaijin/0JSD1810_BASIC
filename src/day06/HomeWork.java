package day06;

import java.util.Arrays;

import utils.Generate;

public class HomeWork {

	public static void main(String[] args) {
		// �������ݡ�1.����������� 2.�ҳ��������ֵ 3.���������ֵ�ŵ�����������
		arrayExtend1();
		arrayExtend2();
		// ð��:1.����������� 2.ð������
		bubbleSort1();
		bubbleSort2();
		// ÿ����������

		System.out.println();
		System.out.println("��������Сֵ������:");
		// 1.��ѯ������Сֵ����������ڵ�һλ
		getMinNumOfIntArray();
		System.out.println();
		// 2.�ܽ�ð�������㷨��ԭ��
		// 3.�����������(��װһ������generateArray���÷���ʵ������ָ�����ȵ�int���飬�������Ԫ��Ϊ0��ָ����Χ�ڵ�����������������鷵�ء�)
		System.out.println();
		System.out.println("�����������:");
		int[] randomIntArray = Generate.getRandomIntArray(0, 5, 5);
		System.out.println(Arrays.toString(randomIntArray));
		System.out.println();

		// �޲� �޷���ֵ
		say();
		// �в� �޷���ֵ
		sayHi("����");
		// ���� �޷���ֵ
		sayHello("����", 28);
		// �޲� �з���ֵ
		int num = getNum();
		System.out.println(num);
		// ���� �з���ֵ
		int a = 5, b = 10;
		int plusResult = plus(a, b);
		System.out.println(plusResult);

		// �ڶ���
		// �޲� �޷���ֵ
		say2();
		// �в� �޷���ֵ
		sayHi2("Hi");
		// ���� �޷���ֵ
		sayHello("Hello", 39);
		// �޲� �з���ֵ
		String name = getName();
		System.out.println(name);
		// ���� �з���ֵ
		String connectStr = connectStr("����1", "����2");
		System.out.println(connectStr);
	}

	private static void getMinNumOfIntArray() {
		// ����һ�������飬ָ�����ȡ�
		int[] intArr = Generate.getRandomIntArray(50, 100, 8);
		System.out.println("ԭ���飺" + Arrays.toString(intArr));
		// �ҳ���Сֵ
		Arrays.sort(intArr);
		int min = intArr[0];
		// ��������
		intArr = Arrays.copyOf(intArr, intArr.length + 1);

		int[] intArr2 = new int[intArr.length];
		System.out.println("����������ݺ����飺" + Arrays.toString(intArr));
		// ����Сֵ���ڵ�һλ
		System.arraycopy(intArr, 0, intArr2, 1, intArr.length - 1);
		intArr2[0] = min;
		System.out.println("��Сֵ:" + min);
		intArr = intArr2;
		System.out.println("����Сֵ������ǰ��Ľ����" + Arrays.toString(intArr));
	}

	private static void bubbleSort2() {
		// ð��:1.����������� 2.ð������
		System.out.println();
		System.out.println("ð������2:");
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 93);
		}
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int t = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void arrayExtend2() {
		// �������ݡ�1.����������� 2.�ҳ��������ֵ 3.���������ֵ�ŵ�����������
		System.out.println();
		System.out.println("��������2:");
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 50);
		}

		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		arr = Arrays.copyOf(arr, arr.length + 1);
		arr[arr.length - 1] = max;
		System.out.println(Arrays.toString(arr));
	}

	private static void bubbleSort1() {
		System.out.println();
		System.out.println("ð������1:");
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr2));
		for (int i = 0; i < arr2.length - 1; i++) {
			for (int j = 0; j < arr2.length - 1 - i; j++) {
				if (arr2[j] > arr2[j + 1]) {
					int t = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = t;
				}
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

	private static void arrayExtend1() {
		System.out.println("��������1:");
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr1));
		int max = arr1[0];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > max) {
				max = arr1[i];
			}
		}
		arr1 = Arrays.copyOf(arr1, arr1.length + 1);
		arr1[arr1.length - 1] = max;
		System.out.println(Arrays.toString(arr1));
	}

	public static void say() {
		System.out.println("�޲� �޷���ֵ����");
	}

	public static void sayHi(String name) {
		System.out.println("�в� �޷���ֵ,����Ϊ��" + name);
	}

	public static void sayHello(String name, int age) {
		System.out.println("�������� �޷���ֵ,����1��" + name + ",����2��" + age);
	}

	public static int getNum() {
		return (int) (Math.random() * 100);
	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static void say2() {
		System.out.println("�޲� �޷���ֵ����2");
	}

	public static void sayHi2(String name) {
		System.out.println("�����в��޷���ֵ����������Ϊ�� " + name);
	}

	public static void sayHello2(String name, int age) {
		System.out.println("���������޷���ֵ����������1��" + name + ",����2�� " + age);
	}

	public static String getName() {
		return "����";
	}

	public static String connectStr(String str1, String str2) {
		return str1 + str2;
	}

}
