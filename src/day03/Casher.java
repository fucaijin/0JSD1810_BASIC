package day03;
import java.util.Scanner;

/**
 * 收银台，完成课后作业第九题
 */
public class Casher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入商品价格:");
		double price = scanner.nextDouble();
		
		System.out.println("请输入商品数量:");
		int amount = scanner.nextInt();
		
		double needPay = price * amount;
//		needPay = needPay >= 500 ? needPay*0.8 : needPay;
		
		System.out.println("商品总价为:" + needPay);
		
		if (needPay >= 500) {
			needPay*=0.8;
			System.out.println("您的金额已达到活动条件，为您打八折，折后价格为" + needPay);
		}
		System.out.println("请输入收取金额:");
		double pay = scanner.nextDouble();
		
		if(pay>=needPay){
			System.out.println("应找零:" + (pay - needPay) + "元");
		}else{
			System.out.println("您给的钱不够，还差" + (needPay - pay) + "元，不给就报警揍你死");
		}
		
		
		int number = 50;
		if (number%2==0) {
			System.out.println(number + "是偶数");
		}
		
	}
	
}
