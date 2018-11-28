package day03;

public class OperDemo {

	public static void main(String[] args) {
		
		System.out.println(5%3);//2
		System.out.println(6%3);//0
		System.out.println(3%6);//3
		
		int a = 5;
		a++;
		System.out.println(a); //6
		
		int b = 5;
		++b;
		System.out.println(b); //6

		int c = 5;
		int d = c++;
		System.out.println(c); //6
		System.out.println(d); //5

		int e = 5;
		int f = ++e;
		System.out.println(e); //6
		System.out.println(f); //6

		int g = 5, h = 5;
		System.out.println(g--); //5
		System.out.println(--h); //4
		
		int i = 3, j = 9, k = 3;
		boolean l = i>j;
		System.out.println(l); 		//false
		System.out.println(j<k);	//false
		System.out.println(i<=k);	//true
		System.out.println(j>=k);	//true
		System.out.println(i==k);	//true
		System.out.println(i!=k);	//false
		System.out.println(j%2 == 1);//true
		System.out.println(j++ > 9);//false
		System.out.println(++k > 3);//true
		
		
	}

}
