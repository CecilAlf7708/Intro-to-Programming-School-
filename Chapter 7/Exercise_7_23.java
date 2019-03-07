/* Alfred Thomas Cecil
3/5/19
A program that tells out of 100 lockers which are open or closed */


public class Exercise_7_23 {
	public static void main(String[] args) {
		int student = 1;
		boolean [] lockers = new boolean [100];
		
		while(student < 101) {
			for(int index = student - 1; index < 100; index += student){
				lockers[index] = !lockers[index]; 
			}
			student++;
		}
		
		for (int i = 0; i < 100; i++) {
			if(lockers[i] == true){
				System.out.print((i + 1) + " ");
			}
			
		}
		
		
	}
}