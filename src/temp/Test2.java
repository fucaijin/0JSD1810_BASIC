package temp;

public class Test2 {
	public static void main(String[] args) {
		UsrInfo a = new UsrInfo(){
			public int getAge() {
				return 18;
			}
		};
		System.out.println(a.getAge());
	}
	
	interface UsrInfo{
		public abstract int getAge();
	}
}

