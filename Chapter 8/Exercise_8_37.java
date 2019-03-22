/* Alfred Thomas Cecil
3/20/19
A program thats has the user guess the capital of ten states */
import java.util.Scanner;

public class Exercise_8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctAnswers = 0;
		String[][] array = {{"alaska", "auneau"},
							{"arkansas", "little rock"},
							{"california", "sacramento"},
							{"delaware", "dover"},
							{"georgia", "atlanta"},
							{"idaho", "boise"},
							{"missouri", "jefferson city"},
							{"ohio", "columbus"},
							{"tennessee", "nashville"},
							{"utah", "salt lake city"}};
		//System.out.println(correctAnswers + " " + array[0][1]);
		System.out.println("Q1: What is the capital of Alaska? ");
		String answer1 = input.nextLine();
		answer1 = answer1.toLowerCase();
		if(answer1.equals(array[0][1])){
			correctAnswers++;
			//System.out.print("correct");
		}
		
		System.out.println("Q2: What is the capital of Arkansas? ");
		String answer2 = input.nextLine();
		answer2 = answer2.toLowerCase();
		if(answer2 .equals(array[1][1])){
			correctAnswers++;
		}
				
		System.out.println("Q3: What is the capital of California? ");
		String answer3 = input.nextLine();
		answer3 = answer3.toLowerCase();
		if(answer3 .equals(array[2][1])){
			correctAnswers++;
		}
				
		System.out.println("Q4: What is the capital of Delaware? ");
		String answer4 = input.nextLine();
		answer4 = answer4.toLowerCase();	
		if(answer4 .equals(array[3][1])){
			correctAnswers++;
		}
				
		System.out.println("Q5: What is the capital of Georgia? ");
		String answer5 = input.nextLine();
		answer5 = answer5.toLowerCase();
		if(answer5 .equals(array[4][1])){
			correctAnswers++;
		}
			
		System.out.println("Q6: What is the capital of Idaho? ");
		String answer6 = input.nextLine();
		answer6 = answer6.toLowerCase();
		if(answer6 .equals(array[5][1])){
			correctAnswers++;
		}
				
		System.out.println("Q7: What is the capital of Missouri? ");
		String answer7 = input.nextLine();
		answer7 = answer7.toLowerCase();	
		if(answer7 .equals(array[6][1])){
			correctAnswers++;
		}
				
		System.out.println("Q8: What is the capital of Ohio? ");
		String answer8 = input.nextLine();
		answer8 = answer8.toLowerCase();
		if(answer8 .equals(array[7][1])){
			correctAnswers++;
		}
				
		System.out.println("Q9: What is the capital of Tennessee? ");
		String answer9 = input.nextLine();
		answer9 = answer9.toLowerCase();	
		if(answer9 .equals(array[8][1])){
			correctAnswers++;
		}
				
		System.out.println("Q10: What is the capital of Utah? ");		
		String answer10 = input.nextLine();
		answer10 = answer10.toLowerCase();		
		if(answer10 .equals(array[9][1])){
			correctAnswers++;
		}
				
		System.out.print("You answered " + correctAnswers + "/10 correctly.");
		
		
		
		
		
		
		
		
		
		
	}
}