import java.util.Scanner;

public class Exercise_2_23 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		
		System.out.print("Enter miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		
		double gallonsConsumed = drivingDistance / milesPerGallon;
		
		double priceOfTrip = pricePerGallon * gallonsConsumed;
		
		System.out.println("The price of the trip will be: " + (int)priceOfTrip);
	}
}