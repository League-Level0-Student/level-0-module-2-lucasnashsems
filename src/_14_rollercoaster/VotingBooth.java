package _14_rollercoaster;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		
		String quantity = JOptionPane.showInputDialog("Enter your age(22, 69, 40)");
			
			
			int A = Integer.parseInt(quantity);
			
		if(A > 18) {
			
			JOptionPane.showMessageDialog(null, "Who do you think the next president should be.");
			
		}
			
		if(A < 18)	{
			
			JOptionPane.showMessageDialog(null, "You, an incompitent foooool are not over 18. Nobody cares about you.");
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
