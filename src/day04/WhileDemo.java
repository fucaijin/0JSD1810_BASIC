package day04;

public class WhileDemo {

	public static void main(String[] args) {
		int a = 0;
		while (a < 10) {
			System.out.println("行动是成功的阶梯");
			a++;
		}

		System.out.println("");

		int b = 1;
		while (b <= 9) {
			System.out.println(b + "*9 = " + b * 9);
			b++;
		}
//		执行过程：
//		b=1    1*9=9     b=2	
//		b=2    2*9=18    b=3	
//		b=3    3*9=27    b=4	
//		b=4    4*9=36    b=5	
//		b=5    5*9=45    b=6	
//		b=6    6*9=54    b=7	
//		b=7    7*9=63    b=8	
//		b=8    8*9=72    b=9	
//		b=9    9*9=81    b=10	
//		b=10 结束循环
		
		System.out.println("");
		
		int c = 9;
		while(c >= 1){
			System.out.println(c + "*9 = " + c*9);
			c--;
		}
	}

}
