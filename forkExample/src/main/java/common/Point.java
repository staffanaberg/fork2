package common;

public class Point extends Shape {

	//A Point
	public Point(int x, int y) {
		super(x, y);
	}

	//Draw method I thinks
	public void draw() {
		System.out.println("Drawing a point at:(" + getX() + ", " + getY() + ")");
	}
	
	//adding something
}
