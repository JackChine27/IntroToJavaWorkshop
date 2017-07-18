package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot jeff=new Robot();
jeff.penDown();
jeff.setSpeed(10);
jeff.move(210);
jeff.turn(-90);
jeff.move(210);
jeff.turn(-90);
jeff.move(210);
jeff.turn(-90);
jeff.move(210);
for (int j = 0; j < 900; j++) {
	jeff.turn(-90);
	jeff.move(210);
}
	
		
		
	}
}
