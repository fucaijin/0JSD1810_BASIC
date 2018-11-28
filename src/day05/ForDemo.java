package day05;

public class ForDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i != 100){
				System.out.print(i + "+");
			}else{
				System.out.print(i + "=");
			}
			sum += i;
		}
		System.out.println(sum);

		// Ö´ÐÐ¹ý³Ì                                         
		// sum = 0
		// i = 1 sum = 0 + 1
		// i = 2 sum = 0 + 1 + 2
		// i = 3 sum = 0 + 1 + 2 + 3
		// i = 4 sum = 0 + 1 + 2 + 3 + 4
		// i = 5 sum = 0 + 1 + 2 + 3 + 4 + 5
		// i = 6 sum = 0 + 1 + 2 + 3 + 4 + 5 + 6
		// ...
		// i = 100 sum = 0 + 1 + 2 + 3 + 4 + 5 + 6 + ... + 100
		// i = 101
	}

}
