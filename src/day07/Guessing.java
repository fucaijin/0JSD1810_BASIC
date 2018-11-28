package day07;

import java.util.Scanner;

/**
 * 猜字符游戏
 * @author fucaijin
 *
 */
public class Guessing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] chs = generate();
		int falseTimes = 0;
		System.out.println(chs);
		while (true) {
			System.out.println("猜吧！");
			String inputStr = scanner.nextLine().toUpperCase();
			if (inputStr.equals("EXIT")) {
				System.out.println("欢迎下次再来！");
				break;
			}
			char[] input = inputStr.toCharArray();
			int[] result = check(chs, input);
			if(result[0] == chs.length){
				int score = 100*chs.length - 10*falseTimes;
				System.out.println("恭喜你猜对了,得分为：" + score);
				break;
			}else{
				falseTimes++;
				System.out.println("没猜对，猜对字符个数为：" + result[1] + "，猜对字符位置个数为" + result[0]);
			}
		}
		scanner.close();
	}

	// 生成随机字符数组chs
	public static char[] generate() {
		char[] chs = new char[5];
//		生成随机的字符
		char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		
		boolean[] used = new boolean[letters.length];
		
		for (int i = 0; i < chs.length; i++) {					// 遍历要生成的字符的数组，逐个生成字符
			int index;
			do{
				index = (int)(Math.random()*letters.length); 	// 生成随机的26字母内的	索引
			}while(used[index] == true);						// 判断索引是否有被用过，如果用过就循环重新生成
			chs[i] = letters[index];							// 根据生成的随机索引抽取随机字符，赋值给存储字符的数组
			used[index] = true;
		}
		
		// i=0	index=5 	chs[0]='F'	use[5]=true
		// i=1	index=2 	chs[1]='C'	use[2]=true
		// i=2	index=5/2/3 chs[2]='D'	use[3]=true
		// i=3	index=15	chs[3]='P'	use[15]=true
		// i=4	index=21	chs[4]='V'	use[21]=true
		
		
		return chs;
	}

	// 对比:随机字符数组chs和用户输入的字符数组input
	public static int[] check(char[] chs, char[] input) {
		int[] result = new int[2];	//对比结果
		for (int i = 0; i < chs.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (chs[i] == input[j]) {
					result[1]++;//字符正确次数
					if(i == j){
						result[0]++;//位置正确次数
					}
					break;
				}
			}
		}
		
		return result;
	}
	
}
