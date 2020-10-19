

import acm.graphics.*;
import acm.program.*;

public class FlipImage extends GraphicsProgram {

	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;
	
	GImage originalImage = new GImage("Vermeer_Milkmaid.jpg");
	
			public void run() {
				
				GImage image = new GImage("Vermeer_Milkmaid.jpg");
				GImage flippedImage =  flipImage(image);
				
				image.scale(1.0);
				add(image, 10, 10);
			}
			
			private GImage flipImage(GImage image) {
				int[][] array = image.getPixelArray();
				
				int height = array.length;
				int width = array[0].length;
				
				return null;
			}
}