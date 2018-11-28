package utils;

public class Generate {

	/**
	 * @param 随机数的最小值
	 * @param 随机数的最大值
	 * @param length 随机数组的长度
	 * @return 返回一个随机的数组
	 */
	public static int[] getRandomIntArray(int min, int max, int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random()*(max+1-min));//max+1是为了包含到那个数，例如0-100就是随机数*101
		}
		return arr;
	}

}
