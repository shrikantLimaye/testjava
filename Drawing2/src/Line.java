public class Line extends Shape { //concrete 
	private float x2, y2;

	public Line(float x1, float y1, float x2, float y2) {
		super(x1,y1);
		this.x2 = x2; this.y2 = y2;
	}
	public void draw(PApplet p) {
		p.line(x,y, x2, y2);
	}
	public void move(float dx, float dy) {
		x += dx; y += dy;
		x2 += dx; y2 += dy;
	}
}
