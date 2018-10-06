package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String mypet = JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		while(happinessLevel<30) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Activities", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk","groom","clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if(task == 0) {
				cuddle();
			}
			if(task == 1) {
				food();
			}
			if(task == 2) {
				water();
			}
			if(task == 3) {
				takeawalk();
			}
			if(task == 4) {
				groom();
			}
			if(task == 5) {
				cleanuppoop();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel>=30) {
				JOptionPane.showMessageDialog(null, "You love your pet.");
				break;
			}
	}
	}

    // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Don't you have anything better to do?");
		happinessLevel = happinessLevel+10;
	}
	static void food() {
		JOptionPane.showMessageDialog(null,"Your pet has more energy!");
		happinessLevel = happinessLevel+20;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "At least your pet won't have a heat stroke.");
		happinessLevel = happinessLevel+10;
	}
	static void takeawalk() {
		JOptionPane.showMessageDialog(null, "What is this, P.E?");
		happinessLevel = happinessLevel+5;
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, "Good hygiene.");
		happinessLevel = happinessLevel+30;
	}
	static void cleanuppoop() {
		JOptionPane.showMessageDialog(null, "I feel bad for you.");
		happinessLevel = happinessLevel+5;
	}
}