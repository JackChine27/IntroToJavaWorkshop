package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...

		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		
		// Get the user to enter an adjective

		String ans=JOptionPane.showInputDialog("Enter an adjective");
		
		// Get the user to enter a type of liquid

		String answer=JOptionPane.showInputDialog("Enter a type of liquid");
		
		// Get the user to enter a body part

		String hi=JOptionPane.showInputDialog("Enter the name of a type of body part");
		
		// Get the user to enter a verb

		String jeff=JOptionPane.showInputDialog("Enter a verb");
		
		// Get the user to enter a place

		String mynameisjeff=JOptionPane.showInputDialog("Enter the name of a place");
		
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		JOptionPane.showMessageDialog(null, "Piranhas are more "+ans+" during the day, so cross the river at night. Piranhas are attracted to fresh "+answer+" and will most likely take a bite out of your "+hi+" if you "+jeff+". Whatever you do, if you have an open wound, try to find another way back to "+mynameisjeff+". Good luck!"); 
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

