package day3;

import javax.swing.JOptionPane;

public class HelloWorld {
	public static void main(String[] args) {
		String name = "jeff";
		JOptionPane.showMessageDialog(null, "Hi " + name);
		String ans = JOptionPane.showInputDialog("Enter your fav color");
		JOptionPane.showMessageDialog(null, ans);
		if (ans.equals("green")) {
			JOptionPane.showMessageDialog(null, "you have bad taste");

		} else {
			JOptionPane.showMessageDialog(null, "you have good taste");
		}
	}
}