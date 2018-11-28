package day07;

import java.util.Scanner;

public class Guessing4 {

	public static void main(String[] args) {
		// 猜5个随机的字符
		Scanner scanner = new Scanner(System.in);
		// 生成5个随机的，且不重复的字符
		char[] chs = generate();
		System.out.println("欢迎猜字符");
		System.out.println(chs);
		// 让用户输入(如果输入退出的话就退出)
		// 比较两个猜中几个字符，几个字符位置正确
		while (true) {
			System.out.println("猜吧！");
			String inputStr = scanner.nextLine().toUpperCase();
			if("EXIT".equals(inputStr.trim())){
				System.out.println("欢迎下次再来~");
				break;
			}
			char[] input = inputStr.toCharArray();
			int[] score = checkLetters(chs, input);
			if(score[1] == 5){
				System.out.println("恭喜你全猜对啦~");
				break;
			}else{
				System.out.println("猜对" + score[0] + "个字符，" + score[1] + "个字符位置正确");
			}
		}
		// 如果都正确就退出，如果不完全正确就继续
		scanner.close();
	}

	private static int[] checkLetters(char[] chs, char[] input) {
		int[] score = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if(chs[i] == input[j]){
					score[0]++;
					if(i == j){
						score[1]++;
					}
				}
			}
		}
		return score;
	}

	/**
	 * @return 返回生成5个随机且不重复的字符
	 */
	private static char[] generate() {
		// 成5个随机的，且不重复的字符
		char[] chs = new char[5];

		// 准备26个字符
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65 + i);
		}

		// 遍历一遍char数组，分别给每个数赋值
		for (int i = 0; i < chs.length; i++) {
			int index = generateRandomIndex(letters);
			if (i == 0) {
				chs[i] = letters[index];
			} else {
				// 从第二个字符开始判断，当前产生的字符是否与之前产生的字符有重，有重就重新生成索引，如果不重就赋值
				index = generateRandomIndex(letters);
				//
				// 遍历之前产生的字符，如果之前产生的字符与现在生成的字符有重复，就继续生成新的索引，然后循环判断，直至当前产生的字符与之前的不重复
				for (int j = 0; j < i; j++) {
					while (chs[j] == letters[index]) {
						index = generateRandomIndex(letters);
						// System.out.println(i); // 用于测试哪个位置的字符重复
						// System.out.println(chs[j]); // 用于检测重复的字符是什么
					}
				}

				chs[i] = letters[index];
			}
			// 生成随机字母
		}

		return chs;
	}

	private static int generateRandomIndex(char[] letters) {
		return (int) (Math.random() * letters.length);
	}

}
