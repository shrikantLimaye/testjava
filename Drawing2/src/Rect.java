import java.awt.*;
public class Rect extends Shape { //concrete 
	private float w,h;

	public Rect(float x, float y, float w, float h) {
		super(x,y);
		this.w = w; this.h = h;
	}
	public void draw(Graphics g) {
		g.drawRect((int)x, (int)y, (int)w, (int)h);
	}
	public void move(float dx, float dy) {
		x += dx; y += dy;
	}
}
