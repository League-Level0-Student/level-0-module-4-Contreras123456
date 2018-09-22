package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testscores {

public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What is your test score?");
	float test = Float.parseFloat(score);
	if(test>99) {
		JOptionPane.showMessageDialog(null, "Excellent work");
	}
	else if(test>90) {
		JOptionPane.showMessageDialog(null, "Keep up the good work!");
	}
	else if(test>80) {
		JOptionPane.showMessageDialog(null, "Good job.");
	}
	else if(test>70) {
		JOptionPane.showMessageDialog(null, "Meh");
	}
	else if(test>60) {
		JOptionPane.showMessageDialog(null, "What is with you?");
	}
	else {
		JOptionPane.showMessageDialog(null, "You need summer school.");
	}
}
}


