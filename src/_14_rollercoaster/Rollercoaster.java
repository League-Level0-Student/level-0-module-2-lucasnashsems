package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
	
String quantity = JOptionPane.showInputDialog("Enter you height in inches(Ex, 48, 23, 89)");
	
	
	int A = Integer.parseInt(quantity);
	
if(A > 48) {
	
	JOptionPane.showMessageDialog(null, "You are allowed to ride on Griffins haircraft carrier!");
	
}
	
if(A < 48)	{
	
	JOptionPane.showMessageDialog(null, "You are not allowed to ride on Griffins haircraft carrier.");
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
