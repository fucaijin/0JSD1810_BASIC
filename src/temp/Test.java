package temp;

public class Test {

	public static void main(String[] args) {
		
	}

	/**
	 * 二进制练习
	 */
	private static void binarayExercise() {
		// 0111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111
		// 1111 1111
		// 1000000000000000000000000000000000000000000000000000000000000000

		// 0000 0000 0000 0000 0000 0000 0000 0000
		// int j = 31;
		// while(j>0){
		// System.out.println();
		// j--;
		// }

		int a = -99;
		int b = ~a + 1;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("");

		System.out.println(a(Integer.toBinaryString(a), "int"));
		System.out.println(a(Integer.toBinaryString(~a), "int"));
		System.out.println(a(Integer.toBinaryString(b), "int"));
		System.out.println("");
		System.out.println("");
		System.out.println("");
		// 0011101
		// 1100010
		// 1100011

		long c = -10000000000L;
		long d = ~c + 1;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("");

		System.out.println(a(Long.toBinaryString(c), "long"));
		System.out.println(a(Long.toBinaryString(~c), "long"));
		System.out.println(a(Long.toBinaryString(~c + 1), "long"));

		System.out.println("===========================================");
		System.out.println("");

		// 0110101011111101000001110000000000
		// 1001010100000010111110001111111111
		// 1001010100000010111110010000000000

		// n = 01101111 00100101 11101110 11101101
		// m = 00000000 00000000 00000000 11111111
		// k=n&m 00000000 00000000 00000000 11101101

		int n = 0x6f25eeed;
		int m = 0xff;
		int k = 0xed;

		System.out.println(a(Integer.toBinaryString(n), "int"));
		System.out.println(a(Integer.toBinaryString(m), "int"));
		System.out.println(a(Integer.toBinaryString(k), "int"));
		System.out.println("");

		// 校区 班级 姓名 Cang_lao_shi
		int o = 0x6f25eeed;
		int p = o % 8;
		int q = o & 7;
		System.out.println(o);
		System.out.println(p);
		System.out.println(q);

		// 01011001 11011110 00011101 11010101
		// 0x59de1dd5

		int r = 0x59de1dd5;
		int s = r & 0xff;
		int t = (r >>> 8) & 0xff;
		int u = (r >>> 16) & 0xff;
		int v = (r >>> 24) & 0xff;
		System.out.println(a(Integer.toBinaryString(r), "int"));
		System.out.println("");

		System.out.println(a(Integer.toBinaryString(s), "int"));
		System.out.println(a(Integer.toBinaryString(t), "int"));
		System.out.println(a(Integer.toBinaryString(u), "int"));
		System.out.println(a(Integer.toBinaryString(v), "int"));
		System.out.println("");

		int w = 0xdd00;
		int x = 0xb7;
		int y = w | x;
		System.out.println(a(Integer.toBinaryString(w), "int"));
		System.out.println(a(Integer.toBinaryString(x), "int"));
		System.out.println(a(Integer.toBinaryString(y), "int"));

		int i = 0x5ee97a1d;
		System.out.println(a(Integer.toBinaryString(i), "int"));

		int j = 100;
		System.out.println(j >> 2); // 100/2^2 = 25
		System.out.println(j << 4); // 100*2^4 = 100 * 16 = 1600

		// 作业
		int e = -50;
		int f = e >> 1;
		int g = e >> 2;
		int h = e >>> 1;
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}

	/**
	 * 
	 * @param str 传入的二进制字符串
	 * @param type 二进制的字符串的原始类型
	 * @return 返回补全的二进制字符串
	 */
	public static String a(String str, String type) {
		int length = str.length();
		int needAdd = 0;
		if (type.equals("int")) {
			needAdd = 32 - length;
		} else if (type.equals("long")) {
			needAdd = 64 - length;
		}
		StringBuilder stringBuilder = new StringBuilder();
		while (needAdd > 0) {
			stringBuilder.append("0");
			needAdd--;
		}
		return stringBuilder.append(str).toString();
	}

}
