package day04;

import java.util.Scanner;

/**
 * 接受用户输入的命令，并输出
 */
public class CommandBySwitch {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请选择功能：1.显示全部记录 2.查询登陆记录 0.退出");
//		int command = scanner.nextInt();
//		
//		switch (command) {
//		case 1:
//			System.out.println("显示全部记录");
//			break;
//		case 2:
//			System.out.println("查询登陆记录");
//			break;
//		case 0:
//			System.out.println("欢迎下次再来");
//			break;
//		}
//		
//		if (command == 1) {
//			System.out.println("显示全部记录");
//		} else if(command == 2){
//			System.out.println("查询登陆记录");
//		} else if(command == 0){
//			System.out.println("欢迎下次再来");
//		} else{
//			System.out.println("输入错误");
//		}
		
//		第一次作业
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请选择功能：1.显示全部记录 2.查询登陆记录 0.退出");
//		int choiceFun = scanner.nextInt();
//		switch (choiceFun) {
//		case 1:
//			System.out.println("显示全部记录");
//			break;
//		case 2:
//			System.out.println("查询登陆记录");
//			break;
//		case 0:
//			System.out.println("您已退出，欢迎下次再来");
//			break;
//		}
//		scanner.close();
		
//		第二次作业
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择功能：1.显示全部记录 2.查询登陆记录 0.退出");
		int choiceFun = scanner.nextInt();
		switch (choiceFun) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询登陆记录");
			break;
		case 0:
			System.out.println("已退出，欢迎下次再来");
			break;
		}
		scanner.close();
	}

}
