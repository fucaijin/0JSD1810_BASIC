package temp;

import java.util.TimerTask;
import java.util.Timer;

public class Test1 {
	int testIndex1 = 0;
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.timer1();
	}
	
	public void task() {
		System.out.println("Test1: " + testIndex1++);
	}
	
	public void timer1() {
     Timer timer = new Timer();
     timer.schedule(new TimerTask() {
       public void run() {
         task();
       }
     }, 1000,1000);// 设定指定的时间time,此处为2000毫秒
   }
	
}


