package day04;

import java.util.Scanner;

public class Guessing {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//		int number = (int) (Math.random() * 1000 + 1);
//		System.out.println(number);
//		System.out.println("猜猜你是谁，请输入整数：");
//
//		int guessNumber;
//		do {
//			guessNumber = scanner.nextInt();
//			if (guessNumber == 0) {
//				break;
//			}
//
//			if (guessNumber > number) {
//				System.out.println("你输入的数太大啦");
//			} else if (guessNumber < number) {
//				System.out.println("你输入的数太小啦");
//			}
//
//		} while (guessNumber != number);
//
//		if (guessNumber == number) {
//			System.out.println("恭喜你猜对啦~");
//		} else {
//			System.out.println("下次再来玩呀");
//		}
//
//		/*
//		 * System.out.println("猜猜你是谁，请输入整数："); int guessNumber =
//		 * scanner.nextInt();
//		 * 
//		 * while(guessNumber != number){ if (guessNumber == 0) { break; }
//		 * 
//		 * System.out.print("不对不对，继续猜，"); if (guessNumber>number) {
//		 * System.out.println("你输入的数太大啦"); }else{
//		 * System.out.println("你输入的数太小啦"); } guessNumber = scanner.nextInt(); }
//		 * 
//		 * 
//		 * if(guessNumber == number){ System.out.println("恭喜你猜对啦~"); }else{
//		 * System.out.println("下次再来玩呀 ^_^"); }
//		 * 
//		 */
//		scanner.close();
		
		int num = (int)(Math.random()*1000+1);
		System.out.println(num);
		
		Scanner scanner = new Scanner(System.in);
		
//		猜数字之While
//		System.out.println("请输入猜的数字");
//		int guessNum = scanner.nextInt();
//		while(num != guessNum){
//			if (guessNum == 0) {
//				break;
//			}
//			
//			System.out.print("没猜对，");
//			if(guessNum>num){
//				System.out.println("猜大啦");
//			}else {
//				System.out.println("猜小啦");
//			}
//			
//			System.out.println("继续猜");
//			guessNum = scanner.nextInt();
//		}
//		
//		if(guessNum==0){
//			System.out.println("欢迎下次继续");
//		}else {
//			System.out.println("恭喜你猜对啦");
//		}
		
//		猜数字之do While 第一次
//		int inputNum;
//		do{
//			System.out.println("请输入你猜的数：");
//			inputNum = scanner.nextInt();
//			
//			if(inputNum == 0){
//				break;
//			}
//			
//			if(inputNum > num){
//				System.out.println("猜大啦");
//			}else if(inputNum < num){
//				System.out.println("猜小啦");
//			}
//		}while(inputNum != num);
//		
//		if(inputNum == 0){
//			System.out.println("欢迎下次再玩");
//		}else{
//			System.out.println("恭喜你猜对啦");
//		}
		
		
		
//		猜数字之do While 第二次
		int guessNum;
		do{
			System.out.println("请输入你猜的数：");
			guessNum = scanner.nextInt();
		
			if (guessNum == 0) {
				break;
			}
			if (guessNum > num) {
				System.out.println("猜大了");
			}else if(guessNum < num){
				System.out.println("猜小了");
			}
		}while(guessNum != num);
		
		if (guessNum == 0) {
			System.out.println("欢迎下次猜数");
		} else {
			System.out.println("恭喜你猜对啦");
		}
		
		
		scanner.close();
	}

}
