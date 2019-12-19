//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below!.
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	Random ran = new Random();
	// 3. Print out this variable.
	int randomChoice = ran.nextInt(4);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "Enter a question.");




if (randomChoice == 1) {
JOptionPane.showMessageDialog(null, "Yes");
} else if (randomChoice == 2) {
	JOptionPane.showMessageDialog(null, "No");
} else if (randomChoice == 3) {
	JOptionPane.showMessageDialog(null, "Maybe ask google about this");
} else {
	JOptionPane.showMessageDialog(null, "You know what no I refuse");
}
	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
}
