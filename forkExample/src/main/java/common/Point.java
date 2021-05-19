package common;

public class Point extends Shape {

	//A Point
	public Point(int x, int y) {
		super(x, y);
	}

	//Draw method I think
	public void draw() {
		System.out.println("Drawing a point at:(" + getX() + ", " + getY() + ")");
	}
	
	//adding something
}
