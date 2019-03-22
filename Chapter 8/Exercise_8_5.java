import java.awt.geom.*;

/* Alfred Thomas Cecil
3/14/19
A program that adds two compatible matrices together */


public class Exercise_8_5 {
	public static void main(String[] args) {
		
		double arrayA[][] = {
		{1.0, 2.0, 3.0},
		{4.0, 5.0, 6.0},
		{7.0, 8.0, 9.0}
		};
		double arrayB[][] = {
		{0.0, 2.0, 4.0},	
		{1.0, 4.5, 2.2},	
		{1.1, 4.3, 5.2}	
		};
		double[][] arrayD = addMatrix(arrayA, arrayB);
		for(int row = 0; row < arrayD.length; row++){
			for(int col = 0; col < arrayD.length; col++){
				System.out.print(arrayD[row][col] + " ");

			}
			System.out.println();
		}	
	}
	
	public static double[][] addMatrix(double[][] arrayA, double[][] arrayB){
		double[][] arrayC = new double[3][3];
		for(int row = 0; row < arrayC.length; row++){
			for(int col = 0; col < arrayC.length; col++){
				arrayC[row][col] = arrayA[row][col] + arrayB[row][col];
			}
		}
				
		
		
		
		return arrayC;
		
	}
	
}