package day03;
import java.util.Scanner;

/**
 * ����̨����ɿκ���ҵ�ھ���
 */
public class Casher {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������Ʒ�۸�:");
		double price = scanner.nextDouble();
		
		System.out.println("��������Ʒ����:");
		int amount = scanner.nextInt();
		
		double needPay = price * amount;
//		needPay = needPay >= 500 ? needPay*0.8 : needPay;
		
		System.out.println("��Ʒ�ܼ�Ϊ:" + needPay);
		
		if (needPay >= 500) {
			needPay*=0.8;
			System.out.println("���Ľ���Ѵﵽ�������Ϊ������ۣ��ۺ�۸�Ϊ" + needPay);
		}
		System.out.println("��������ȡ���:");
		double pay = scanner.nextDouble();
		
		if(pay>=needPay){
			System.out.println("Ӧ����:" + (pay - needPay) + "Ԫ");
		}else{
			System.out.println("������Ǯ����������" + (needPay - pay) + "Ԫ�������ͱ���������");
		}
		
		
		int number = 50;
		if (number%2==0) {
			System.out.println(number + "��ż��");
		}
		
	}
	
}
