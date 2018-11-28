package oo.day03;

public class ConstructorDemo {

	public static void main(String[] args) {
		Bee1 bee1 = new Bee1();
		BigAirplane1 bigAirplane1 = new BigAirplane1();
		Airplane1 airPlane1 = new Airplane1();
		Bullet1 bt1 = new Bullet1(200, 150);
		
		System.out.println("b.x = " + bee1.x + ", b.y = " + bee1.y);
		System.out.println("bt.x = " + bt1.x + ", bt.y = " + bt1.y);
	}

}

class FlyingObject1 {
	int x;
	int y;
	int width;
	int height;

	FlyingObject1(int w, int h) {
		width = w;
		height = h;
		x = (int) (Math.random() * (400 - width));
		y = -height;
	}
	
	public FlyingObject1() {
	}
}

class Airplane1 extends FlyingObject1 {
	int speed;

	public Airplane1() {
		super(36, 49);
	}
}

class BigAirplane1 extends FlyingObject1 {
	int speed;

	public BigAirplane1() {
		super(60, 30);
	}
}

class Bee1 extends FlyingObject1 {
	int xSpeed;
	int ySpeed;

	public Bee1() {
		super(60, 30);
		xSpeed = 1;
		ySpeed = 1;
	}
}

class Bullet1 extends FlyingObject1{
	public Bullet1(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.height = 8;
		this.width = 14;
	}
}