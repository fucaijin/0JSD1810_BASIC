package day05;

import java.util.Scanner;

public class Addition {
	
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		for (int i = 1; i <= 10; i++) {
			int a = (int)(Math.random()*100);
			int b = (int)(Math.random()*100);
			int result = a + b;
			
			System.out.println("(" + i + ")" + a + "+" + b + "=?" );
			System.out.println("算吧！");
			
			int input = scanner.nextInt();
			if(input == -1){
				break;
			}
			if(input == result){
				System.out.println("答对了");
				score+=10;
			}else{
				System.out.println("答错了");
			}
		}
		System.out.println("得分为：" + score);
		scanner.close();
	}
	
}
