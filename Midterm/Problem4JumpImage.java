/*Problem4JumpImage.java
 * program makes image jump every time user clicks mouse
 */
package Midterm;

import java.awt.event.MouseEvent;
import acm.graphics.GImage;
import acm.program.GraphicsProgram;

public class Problem4JumpImage extends GraphicsProgram{
	
	public GImage jumpImage = new GImage("frog.png");
	
	public static final int SQSIZE = 75;
	public static final int NCOLS = 7;
	public static final int NROWS = 3;
	public static final int MOVE = 10;
	public int jump;
	
	public void run() {
		
		addMouseListeners();
		placeImage();
	}
	public void placeImage() {
		jumpImage.setLocation(SQSIZE * (NCOLS / 2) , SQSIZE * (NROWS / 2));
		add(jumpImage);
	}
	public void mouseClicked(MouseEvent e) {
		jump();		
	}	

	public void jump() {
		
		jump = 20;
		double y = jumpImage.getY();
		jumpImage.move(0, jump);
		jump = jump - MOVE;
		
		add(jumpImage);		
	
	}

}

