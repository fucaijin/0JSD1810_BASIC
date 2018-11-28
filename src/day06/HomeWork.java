package day06;

import java.util.Arrays;

import utils.Generate;

public class HomeWork {

	public static void main(String[] args) {
		// 数组扩容。1.创建随机数组 2.找出数组最大值 3.将数组最大值放到数组的最后面
		arrayExtend1();
		arrayExtend2();
		// 冒泡:1.创建随机数组 2.冒泡排序
		bubbleSort1();
		bubbleSort2();
		// 每个至少两次

		System.out.println();
		System.out.println("查数组最小值并扩容:");
		// 1.查询数组最小值，并将其放在第一位
		getMinNumOfIntArray();
		System.out.println();
		// 2.总结冒泡排序算法的原理
		// 3.随机生成数组(封装一个方法generateArray，该方法实现生成指定长度的int数组，该数组的元素为0到指定范围内的随机数，并将该数组返回。)
		System.out.println();
		System.out.println("生成随机数组:");
		int[] randomIntArray = Generate.getRandomIntArray(0, 5, 5);
		System.out.println(Arrays.toString(randomIntArray));
		System.out.println();

		// 无参 无返回值
		say();
		// 有参 无返回值
		sayHi("达内");
		// 两参 无返回值
		sayHello("名字", 28);
		// 无参 有返回值
		int num = getNum();
		System.out.println(num);
		// 两参 有返回值
		int a = 5, b = 10;
		int plusResult = plus(a, b);
		System.out.println(plusResult);

		// 第二遍
		// 无参 无返回值
		say2();
		// 有参 无返回值
		sayHi2("Hi");
		// 两参 无返回值
		sayHello("Hello", 39);
		// 无参 有返回值
		String name = getName();
		System.out.println(name);
		// 两参 有返回值
		String connectStr = connectStr("两参1", "两参2");
		System.out.println(connectStr);
	}

	private static void getMinNumOfIntArray() {
		// 生成一个空数组，指定长度。
		int[] intArr = Generate.getRandomIntArray(50, 100, 8);
		System.out.println("原数组：" + Arrays.toString(intArr));
		// 找出最小值
		Arrays.sort(intArr);
		int min = intArr[0];
		// 数组扩容
		intArr = Arrays.copyOf(intArr, intArr.length + 1);

		int[] intArr2 = new int[intArr.length];
		System.out.println("排序后，且扩容后数组：" + Arrays.toString(intArr));
		// 将最小值放在第一位
		System.arraycopy(intArr, 0, intArr2, 1, intArr.length - 1);
		intArr2[0] = min;
		System.out.println("最小值:" + min);
		intArr = intArr2;
		System.out.println("将最小值放在最前面的结果：" + Arrays.toString(intArr));
	}

	private static void bubbleSort2() {
		// 冒泡:1.创建随机数组 2.冒泡排序
		System.out.println();
		System.out.println("冒泡排序2:");
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
		// 数组扩容。1.创建随机数组 2.找出数组最大值 3.将数组最大值放到数组的最后面
		System.out.println();
		System.out.println("数组扩容2:");
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
		System.out.println("冒泡排序1:");
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
		System.out.println("数组扩容1:");
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
		System.out.println("无参 无返回值方法");
	}

	public static void sayHi(String name) {
		System.out.println("有参 无返回值,参数为：" + name);
	}

	public static void sayHello(String name, int age) {
		System.out.println("这是两参 无返回值,参数1：" + name + ",参数2：" + age);
	}

	public static int getNum() {
		return (int) (Math.random() * 100);
	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}

	public static void say2() {
		System.out.println("无参 无返回值方法2");
	}

	public static void sayHi2(String name) {
		System.out.println("这是有参无返回值方法，参数为： " + name);
	}

	public static void sayHello2(String name, int age) {
		System.out.println("这是两参无返回值方法，参数1：" + name + ",参数2： " + age);
	}

	public static String getName() {
		return "名字";
	}

	public static String connectStr(String str1, String str2) {
		return str1 + str2;
	}

}
