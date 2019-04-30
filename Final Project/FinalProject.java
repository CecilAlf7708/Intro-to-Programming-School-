package fProject;
/**
 * <h1>Final Project JavaDoc</h1>
 * <p>This class is what makes up the entire project, from the shuffling of the decks to displaying the winner of the math.</p>
 * <p>Created: 4/29/19</p>
 * @author Alfred Thomas Cecil
 */
import java.util.*;
public class FinalProject {
	/**
	 * This method shuffles the deck,hands cards to each player until the user stops taking cards or goes over twenty-one, and displays the winner and scores
	 * <pre>Examples:
	 * {@code  returnType(y) returns a card of randomly selected value
	 * }</pre>
	 * 
	 * @param args (String[]; unused)
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
	int[] deck = {2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,11,11,11,11};
	int hand = 0;
	int opponent1 = 0;
	int opponent2 = 0;
	int opponent3 = 0;
	char answer = 'y';
	do {
		for (int i = 0; i < 1; i++) {
			int index = (int)(Math.random() * deck.length);
			deck[i] = deck[index];
			int top = deck[0];
			hand += top;
			
			for (int j = 0; j < 1; j++) {
				int index1 = (int)(Math.random() * deck.length);
				deck[j] = deck[index1];
				int top1 = deck[0];
				opponent1 += top1;
			}
			
				for (int k = 0; k < 1; k++) {
					int index2 = (int)(Math.random() * deck.length);
					deck[k] = deck[index2];
					int top2 = deck[0];
					opponent2 += top2;
				}
					
					for (int l = 0; l < 1; l++) {
						int index3 = (int)(Math.random() * deck.length);
						deck[l] = deck[index3];
						int top3 = deck[0];
						opponent3 += top3;
					}
			
			System.out.println(top + " " + hand);
		}
	if (hand <= 21) {
		System.out.println("Would you like another card? Please enter y or n: ");
	answer = input.next().charAt(0);}
	if ( hand > 21) {
		break;
	}
	} while (answer == 'y' && hand <= 21);
	if(hand > 21) {
		System.out.println(opponent1+" "+opponent2+" "+opponent3);
		System.out.println("you lose...");
	}
	else {
		System.out.println("You have " + hand + " points in your hand");
		if(opponent1>21) {
			opponent1 = 0;
		}
		if(opponent2>21) {
			opponent2 = 0;
		}
		if(opponent3>21) {
			opponent3 = 0;
		}
		if(hand < opponent1 || hand < opponent2 || hand < opponent3) { 	
			System.out.println(opponent1+" "+opponent2+" "+opponent3);
			System.out.println("you lose...");
		}
		else if(hand == opponent1 || hand == opponent2 || hand == opponent3) {
			System.out.println(opponent1+" "+opponent2+" "+opponent3);
			System.out.println("Its a tie!");
		}
	if(hand > opponent1 && hand > opponent2 && hand > opponent3) {
			System.out.println(opponent1+" "+opponent2+" "+opponent3);
			System.out.println("You win! ");
			if(hand == 21) {
				System.out.print("Perfect score!");
			}

		}
		}
	}
}
