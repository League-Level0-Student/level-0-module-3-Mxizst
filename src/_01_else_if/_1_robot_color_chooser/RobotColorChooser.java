
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob = new Robot();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		
		//3. Set the pen width to 10
		rob.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String Question = JOptionPane.showInputDialog("What Color Would You Like The Robot To Draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		for (int abcd = 0; abcd < 2; abcd++) {
		
		if (Question.equalsIgnoreCase("red")) { rob.setPenColor(255,0,0);}
		if (Question.equalsIgnoreCase("green")) { rob.setPenColor(0,255,0);}
		if (Question.equalsIgnoreCase("blue")) { rob.setPenColor(0,0,255);}
        //6. If the user doesn't enter anything, choose a random color
		if (Question.equalsIgnoreCase(" ")) {rob.setRandomPenColor();}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		

		



	}
}
}