import java.awt.Graphics;

public abstract class Shape {
	protected float x, y;

	public Shape(float x, float y) {
		this.x = x; this.y = y;
	}
	public abstract  void draw(Graphics g);
	public abstract void move(float dx, float dy);
}
