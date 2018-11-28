package day04;

import java.util.Scanner;

public class ScoreLevel {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入成绩：");
//
//		int score = scanner.nextInt();
//		if (score > 100 || score < 0) {
//			System.out.println("您输入的成绩不合法");
//		} else if (score >= 90) {
//			System.out.println("A - 优秀！");
//		} else if (score >= 80) {
//			System.out.println("B - 良好！");
//		} else if (score >= 60) {
//			System.out.println("C - 合格！");
//		} else {
//			System.out.println("D - 不合格！");
//		}
//
//		if (score <= 100 && score >= 0) {
//			if (score >= 90) {
//				System.out.println("A - 优秀！");
//			} else if (score >= 80) {
//				System.out.println("B - 良好！");				
//			} else if (score >= 60) {
//				System.out.println("C - 合格！");				
//			} else {
//				System.out.println("D - 不合格！");				
//			}
//		} else {
//			System.out.println("您输入的成绩不合法");
//		}
		
		
//		作业第一次
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入你的成绩");
//		int score = scanner.nextInt();
//		if (score > 100 || score < 0 ) {
//			System.out.println("输入的成绩不合法");
//		} else if(score >= 90){
//			System.out.println("A-优秀");
//		}else if(score >= 80){
//			System.out.println("B-良好");
//		}else if(score >= 60){
//			System.out.println("C-合格");
//		}else{
//			System.out.println("D-不合格");
//		}
//		scanner.close();
		
//		作业第二次
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int score = scanner.nextInt();
		if (score > 100 || score < 0) {
			System.out.println("输入的成绩不合法");
		} else if (score >= 90) {
			System.out.println("A-优秀");
		} else if (score >= 80) {
			System.out.println("B-良好");
		} else if (score >= 60) {
			System.out.println("C-合格");
		} else{
			System.out.println("不及格");
		}
		scanner.close();

	}

}
