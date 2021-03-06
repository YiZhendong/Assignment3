/* TODO: Replace these file comments with a description of what your program
 * does.
 */
import acm.graphics.*;
import acm.program.*;

public class Pyramid extends GraphicsProgram {
	/** Width of each brick in pixels */
	private static final double BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final double BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 20;
	
	/** Coordinates of the bricks in the leftmost every row*/
	private static double originalX,originalY;
	
	
	public void run() {
		for(int i=BRICKS_IN_BASE;i>0;i--){
			createBrickRow(i);
		}
	}

	// create a row of bricks
	private void createBrickRow(int i) {
	
		//First get the original coordinates
		getOriginalCoordinate(i);
		
		//Then create a row of bricks;
		for(int j=0;j<i;j++){
			double x,y;
			x = originalX + j * BRICK_WIDTH;
			y = originalY;
			GRect brick = new GRect(x,y,BRICK_WIDTH,BRICK_HEIGHT);
			add(brick);
		}
	}

	private void getOriginalCoordinate(int i) {
		// get the original coordinates(x,y);
		originalX = (getWidth() - i*BRICK_WIDTH)/2;
		originalY = getHeight() - (BRICKS_IN_BASE -i)*BRICK_HEIGHT;
	}
}

