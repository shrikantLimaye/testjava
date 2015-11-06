import java.awt.Graphics;
import javax.swing.*;
import java.util.ArrayList;

public class DrawArea extends JPanel {
	private ArrayList<Shape> drawList; // starts as null
	public DrawArea() {
		drawList = new ArrayList<Shape>(10000);	
		drawList.add(new Circle(100,200,50));
		drawList.add(new Circle(400,300,50));
		drawList.add(new Circle(600,200,50));
	}
	public void paint(Graphics g) {
		for (int i = 0; i < drawList.size(); i++) {
			Shape s = drawList.get(i);
			s.draw(g);
		}
			
	}
}
