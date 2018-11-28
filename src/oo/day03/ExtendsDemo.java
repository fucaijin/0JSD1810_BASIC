package oo.day03;

public class ExtendsDemo {

	public static void main(String[] args) {
		Bee bee = new Bee();
		System.out.println(bee.x);
		System.out.println(bee.y);
		System.out.println(bee.width);
		System.out.println(bee.height);
		System.out.println(bee.xSpeed);
		System.out.println(bee.ySpeed);
	}
}

class FlyingObject{
	int x;
	int y;
	int width;
	int height;
}

class Bee extends FlyingObject{
	int xSpeed;
	int ySpeed;
}

class BigAirplane extends FlyingObject{
}


class Bullet extends FlyingObject{
}

class Hero extends FlyingObject{
}

