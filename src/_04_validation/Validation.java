//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

		// 1. Use each value of randomNumber to give the user a random compliment.
		if (randomNumber == 1) {
		JOptionPane.showMessageDialog(null, "You are Dumbo" );
		} else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "You look like a haircraft carrier" );	
		} else if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "You look like the donkey from shrek" );	
		} else if (randomNumber == 4) {
			JOptionPane.showMessageDialog(null, "You are secretly a thot" );
		} else if (randomNumber == 5) {
			JOptionPane.showMessageDialog(null, "You are a woman" );
		} else {
			JOptionPane.showMessageDialog(null, "You are the king of men. You carry the biggest load and are the manliest person alive. All the girls fall for you when they see you." );
		}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
