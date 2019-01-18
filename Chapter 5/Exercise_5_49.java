/* Alfred Thomas Cecil
1/17/19
A program that counts the number of vowels and consonants in a sentence */
import java.util.Scanner;


public class Exercise_5_49 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String sentence = input.nextLine();
		sentence = sentence.toUpperCase();
		int vowels = 0;
		int consonants = 0;
		for(int count = 0; count < sentence.length(); count++){
			char letters = sentence.charAt(count);
			
			if (letters == 'A' || letters == 'E' || letters == 'I' || letters == 'O' || letters == 'U') {
				vowels++;
			}
			else {
				consonants++;
			}
		}		

		System.out.println("The number of vowels is: " + vowels);
		System.out.print("The number of consonants is: " + consonants);
		
		
		
	}
}