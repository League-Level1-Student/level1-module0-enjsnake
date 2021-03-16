package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob=new Robot();
	public void run() {
		
		rob.setSpeed(100);
		rob.moveTo(50, 500);
		rob.setPenWidth(5);
		rob.penDown();
		drawHouse("small");
		drawHouse("medium");
		drawHouse("large");
		drawHouse("small");
			}

	private void drawHouse(String color, String answer) {
		// TODO Auto-generated method stub
		int height=0;
		String paint="";
		if(answer.equalsIgnoreCase("small")) {
			height=60;
		}
		else if(answer.equalsIgnoreCase("medium")) {
			height=120;
		}
		else {
			height=250;
		}
		if(color.equalsIgnoreCase("red")) {
			paint="255,0,0";
		}
		else if(color.equalsIgnoreCase("blue")) {
			
		}
		rob.setRandomPenColor();
		rob.move(height);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(0,100,0);
		rob.move(50);
		rob.turn(-90);

	}
	
	
		
	
}
