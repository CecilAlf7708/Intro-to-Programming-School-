package fProject;
import java.util.*;
public class FinalProject {
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
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
			int top = deck[0];
			hand += top;
			
			for (int j = 0; j < 1; j++) {
				int index1 = (int)(Math.random() * deck.length);
				int temp1 = deck[j];
				deck[j] = deck[index1];
				deck[index1] = temp1;
				int top1 = deck[0];
				opponent1 += top1;
			}
			
				for (int k = 0; k < 1; k++) {
					int index2 = (int)(Math.random() * deck.length);
					int temp2 = deck[k];
					deck[k] = deck[index2];
					deck[index2] = temp2;
					int top2 = deck[0];
					opponent2 += top2;
				}
					
					for (int l = 0; l < 1; l++) {
						int index3 = (int)(Math.random() * deck.length);
						int temp3 = deck[l];
						deck[l] = deck[index3];
						deck[index3] = temp3;
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
