import java.awt.Graphics;

public class Circle extends Shape { //concrete 
	private float radius;

	public Circle(float x, float y, float r) {
		super(x,y);
		radius = r;
	}
	public void draw(Graphics g) {
		g.drawOval((int)x, (int)y, (int)(2*radius), (int)(2*radius));
	}
	public void move(float dx, float dy) {
		x += dx; y += dy;
	}

}
