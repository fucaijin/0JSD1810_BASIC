package oo.day04;

public class OverrideDemo {

	public static void main(String[] args) {
		
	}
	
	class Coo{
		void show(){}
		double test(){		
			return 0.1;
		}
		Doo sayHi(){
			return null;
		}
		Coo say(){
			return null;
		}
	}
	
	class Doo extends Coo{
//		double show(){	// 父类的返回值为void时，子类重写方法也必须和父类一样
//			return 2.1;
//		}
//		int test(){		// 父类的返回值为基本类型时，子类重写方法也必须和父类一样
//			return 1;
//		}
//		Coo sayHi() {	// 子类的返回值类型必须比父类大，Coo是父类，父类中返回的是Doo是子类，因此子类的返回值比父类大，因此报错
//			return null;
//		}
		
		Doo say(){
			return null;
		}
	}

}
