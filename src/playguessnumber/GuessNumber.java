package playguessnumber;

import javax.swing.JOptionPane;

public class GuessNumber {	
	public static void main(String[] args) {
		int compNumeber = (int)(Math.random()* 100 + 1);
		int userAnswer = 0;
		int count = 1;
		
		
		System.out.println("The correct guess would be " + compNumeber);
		
		while(userAnswer != compNumeber) {
			String response =  JOptionPane.showInputDialog(null, 
					"Enter num beetwen 1 and 100", "Guessing game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + 
			determineGuess(userAnswer, compNumeber, count));
			count++;
		}
	}
	public static String determineGuess(int userAnswer, int compNumeber, int count ) {
		if(userAnswer <= 0 || userAnswer > 100) {	
			return "Your guess is invalid";
		} else if(userAnswer == compNumeber) {
			return "Correct guess";
		} else if(userAnswer > compNumeber) {
			return "Your guess is too high, try again.\nTry Number: " + count;
		} else if(userAnswer < compNumeber) {
			return "Your guess is too low, try again.\nTry Number: " + count;
		} else {
	         return "Your guess is incorrect\nTry Number: " + count;
	   	}
	}
}