/*ImageProcessing.java
 * program process the image and convert it horizontally using arrays
 */
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class ImageProcessing extends GraphicsProgram{

	private static GImage image = new GImage("Vermeer_Milkmaid.jpg", 10, 10);
	private static int counter;

	public void run(){
		//add original image to compare with new image
		add(image);
		add (fliphorizontal(image));
	}
	//method to add (x,y) in array and stored in new array
	public GImage fliphorizontal(GImage image) {

		int[][] array = image.getPixelArray();
		int[][] newArray = image.getPixelArray();

		int width = array.length;
		int height = array[0].length;

		for (int i = 0; i < width; i++) {
			counter = 0;
			for (int j = height - 1; j >= 0; j--) {
				newArray[i][counter] = array[i][j];
				counter++;
			}
		}
		return new GImage(newArray, 400, 10);
	}
}
