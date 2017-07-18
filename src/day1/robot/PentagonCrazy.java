package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot

		Robot jeff=new Robot();
		
		// 3. Put the robot's pen down

		jeff.penDown();
		
		// 8. Make the robot go at maximum speed (10)

		jeff.setSpeed(10);
		
		// 9. Set the pen to a color that you like for the shape

		jeff.setPenColor(80,80,255);
		
		// 4. Make a variable for the number of sides you want (can’t test this one)

		int sides=5;
		
		// 5. Make a variable for the angle you want the robot to turn. Hint: you can divide in Java using "/". Can’t test until step 6.

		int turn=360/5;
		
		// 7. Do steps #2 to #11, 200 times. When this is done you should see a pentagon.

		for(int j=0;j<2000;j++) {
		
			// 2. Move the robot 200 pixels
	
		jeff.move(j);
		
			// 10. Make the robot move "i" pixels instead of 200 (don’t need new line of code for this, just change previous one)
	
		
		
			// 6. Turn the robot the amount in your angle variable
	
		jeff.turn(360/5);
		
			// 11. Turn the robot one more degree

		jeff.turn(1);   }
		
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}