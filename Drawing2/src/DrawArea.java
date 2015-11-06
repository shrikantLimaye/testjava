import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Currency;

public class DrawArea extends JPanel {
	private ArrayList<Shape> drawList; // starts as null
	private int startX, startY;
	public DrawArea() {
		drawList = new ArrayList<Shape>(10000);	
		drawList.add(new Circle(100,200,50));
		drawList.add(new Circle(400,300,50));
		drawList.add(new Circle(600,200,50));
		addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				int endX = e.getX(), endY = e.getY();
				Graphics g = getGraphics();
				drawList.add(new Circle(Math.min(startX,endX), Math.min(startY,endY),
						Math.min((int)Math.abs(endX - startX), (int)Math.abs(endY - startY))/2
						));
				repaint();
//				g.drawOval(Math.min(startX,endX), Math.min(startY,endY), 
	//					(int)Math.abs(endX - startX), (int)Math.abs(endY - startY));
		//		System.out.println(e.getX() + "," + e.getY());
			}
			public void mousePressed(MouseEvent e) {
				startX = e.getX(); startY = e.getY();
//				System.out.println(e.getX() + "," + e.getY());
			}
			
			public void mouseExited(MouseEvent e) {}
			public void mouseEntered(MouseEvent e) {
				setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
			}
			
			public void mouseClicked(MouseEvent e) {
			}
		});
	}
	public void paint(Graphics g) {
		for (int i = 0; i < drawList.size(); i++) {
			Shape s = drawList.get(i);
			s.draw(g);
		}
			
	}
}
