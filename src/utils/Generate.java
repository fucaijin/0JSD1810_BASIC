package utils;

public class Generate {

	/**
	 * @param ���������Сֵ
	 * @param ����������ֵ
	 * @param length �������ĳ���
	 * @return ����һ�����������
	 */
	public static int[] getRandomIntArray(int min, int max, int length) {
		int[] arr = new int[length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (min + Math.random()*(max+1-min));//max+1��Ϊ�˰������Ǹ���������0-100���������*101
		}
		return arr;
	}

}
