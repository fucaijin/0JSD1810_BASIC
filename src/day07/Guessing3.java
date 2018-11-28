
package day07;

import java.util.Scanner;

public class Guessing3 {

	public static void main(String[] args) {
//		生成随机的5个char[],让用户猜，如果没猜对，则扣分
		System.out.println("欢迎来猜数组,请输入你猜的5个字母:");
		Scanner scanner = new Scanner(System.in);
		
		char[] chs = generate();
		System.out.println(chs);
		
		int falseTimes = 0;
		do {
			System.out.println("猜吧");
			String inputStr = scanner.nextLine().toUpperCase();
			if ("EXIT".equals(inputStr)) {
				System.out.println("欢迎下次再来！");
				break;
			}
			
			char[] inputCharArray = inputStr.toCharArray();
			int[] result = check(chs, inputCharArray);
			if(result[1] == chs.length){
				System.out.println("恭喜你猜对啦，得分为:" + (100*chs.length - falseTimes*10));
				break;
			}else{
				falseTimes++;
				System.out.println("猜对" + result[0] + "个字符，" + result[1] +"个位置正确");
			}
			
		} while (true);
		scanner.close();

	}

	private static int[] check(char[] chs, char[] inputCharArray) {
//		比较两个字符是否相等
		int[] result = new int[2];
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < inputCharArray.length; j++) {
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

	private static char[] generate() {
		char[] chs = new char[5];
//		生成5个不重复的随机字母char
//		char[] letters = {'A', 'B', ..., 'Z'}
		
//		准备字母数组
		char[] letters = new char[26];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = (char) (65+i);
		}
		
		boolean[] used = new boolean[letters.length];
		
//		抽出随机字母，放到要返回的数组里去
		for (int i = 0; i < chs.length; i++) {
			int index;
			do {
				index = (int) (Math.random()*letters.length);
			} while (used[index] == true);
			chs[i] = letters[index];
			used[index] = true;
		}
		
		return chs;
	}

}
