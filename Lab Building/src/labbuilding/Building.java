package labbuilding;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Building extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int x = 50;
		int y = 50;
		
		Random r = new Random();
		Color[] c = {Color.RED, Color.BLACK, Color.CYAN, Color.MAGENTA, Color.ORANGE, Color.YELLOW};
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(x, y, 300, 400);
		g.setColor(new Color((r.nextInt(256)), r.nextInt(256), r.nextInt(256)));
		
		y += 30;
		
		for (int j = 0; j < 9; j++) {
			for (int i = 0; i < 6; i++) {
				g.fillRect(x += 40, y, 20, 20);
				//Below to do random colors using RBG values
				//g.setColor(new Color((r.nextInt(256)), r.nextInt(256), r.nextInt(256)));
				
				//Randomly choose one of the 6 colors assigned in the c array
				g.setColor(c[r.nextInt(5)]); 
			}
			y += 40;
			x = 50;
		}
	
		
	}

}
