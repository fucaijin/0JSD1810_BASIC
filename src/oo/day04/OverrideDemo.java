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
//		double show(){	// ����ķ���ֵΪvoidʱ��������д����Ҳ����͸���һ��
//			return 2.1;
//		}
//		int test(){		// ����ķ���ֵΪ��������ʱ��������д����Ҳ����͸���һ��
//			return 1;
//		}
//		Coo sayHi() {	// ����ķ���ֵ���ͱ���ȸ����Coo�Ǹ��࣬�����з��ص���Doo�����࣬�������ķ���ֵ�ȸ������˱���
//			return null;
//		}
		
		Doo say(){
			return null;
		}
	}

}
