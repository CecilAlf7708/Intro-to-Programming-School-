import java.util.Scanner;

public class Exercise_2_13 {
	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		double accountBalance = 0.0;
		
		//Enter annual interest rate in percentage, e.g., 7.25%
		System.out.print("Enter annual interest rate, e.g., 7.25%: ");
		double annualInterestRate = input.nextDouble();
		
		//Obtain monthy interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		//Enter deposit amount
		System.out.print("Enter deposit amount, e.g., 2000.45: ");
		double depositAmount = input.nextDouble();
		
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);		
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);		
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);		
		accountBalance = depositAmount + accountBalance;
		accountBalance = accountBalance * (1 + monthlyInterestRate);		
		
				//Calculate total
//		double monthlyTotal = depositAmount * monthlyInterestRate + depositAmount;
//		System.out.print(monthlyTotal);
//		
//		double totalAmount = monthlyTotal * numberOfMonths * 12 / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths * 12));
		
		//Display results
		System.out.println("The account balance is: " + accountBalance);
		
	}
}