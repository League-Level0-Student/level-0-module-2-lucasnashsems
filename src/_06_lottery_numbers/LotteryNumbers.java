package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	
	Random ran = new Random();
	int randomChoice = ran.nextInt(9 - 1);
	int randomChoice1 = ran.nextInt(9 - 1);
	int randomChoice2 = ran.nextInt(9 - 1);
	int randomChoice3 = ran.nextInt(9 - 1);
	int randomChoice4 = ran.nextInt(9 - 1);
	
	JOptionPane.showMessageDialog(null, randomChoice + randomChoice1 + randomChoice2 + randomChoice3 + randomChoice4);
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
