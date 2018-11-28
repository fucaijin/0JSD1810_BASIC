package day07;

import java.util.Scanner;

public class Guessing2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("欢迎来猜数");
//		生成一个随机的不重复的5个字符长度的数组
		char[] chs = generateLetter();
		System.out.println(chs);
		
		int falseTimes = 0;
		while (true) {
			System.out.println("猜吧！");
			String inputStr = scanner.nextLine().toUpperCase(); 
			if("EXIT".equals(inputStr)){
				System.out.println("欢迎下次再来！");
				break;
			}
			char[] inputCharArray = inputStr.toCharArray();
			int[] result = check(chs, inputCharArray);
			if(result[1] == chs.length){
				System.out.println("恭喜你猜对啦，得分为：" + (100*chs.length - 10*falseTimes));
				break;
			}else{
				System.out.println("猜对字符为：" + result[0] + ",猜对位置个数为" + result[1]);
				falseTimes++;
			}
		}
		
		scanner.close();

	}

	/**
	 * 对比两个数组，并返回对比结果
	 * @param inputCharArray 
	 * @param chs 
	 * @return 返回对比的结果
	 */
	private static int[] check(char[] chs, char[] inputCharArray) {
		int[] result = new int[2];	// [0, 1] 0为正确的字符次数，1为位置正确的次数
//		对两个char中的每个字符分别进行比较
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < inputCharArray.length; j++) {
//				如果有字符相等，就记正确的字符次数，并判断位置是否相等，如果也相等就记正确的位置次数
				if(chs[i] == inputCharArray[j]){
					result[0]++;
					if(i == j){
						result[1]++;
					}
					break;
				}
			}
		}
		
		return result;
	}

	/**
	 * @return 返回生成的随机字符数组，5个字符，且不能重复，A-Z
	 */
	private static char[] generateLetter() {
//		char[] chs = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
//				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
//		准备存放结果的char数组
		char[] chs = new char[5];
//		准备26个字母
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65+i);
		}
//		准备标记数组
		boolean[] used = new boolean[letters.length];
		
//		生成随机的不重复的5个char数组
		for (int i = 0; i < chs.length; i++) {
			int index;
//			生成随机的字母索引，如果索引被标记过则从新生成
			do{
				index = (int) (Math.random()*letters.length);
			}while(used[index] == true);
			
//			如果索引没被标记过，则使用索引取字符，然后对索引进行标记已使用过
			chs[i] = letters[index];
			used[index] = true;
		}
		
		return chs;
	}

}
