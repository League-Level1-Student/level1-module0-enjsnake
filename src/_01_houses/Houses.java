package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		Robot rob=new Robot();
		rob.setSpeed(100);
		rob.moveTo(50, 500);
		rob.setPenWidth(5);
		rob.setRandomPenColor();
		rob.penDown();
		rob.move(100);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(100);
	}
}
