import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);


		int basket[] = new int[s.nextInt()];    
		int ball = s.nextInt(); 				 
		int a = 0; 								
		int b = 0; 								 
		int c = 0; 								

		for (int i = 0; i < ball; i++) { 		
			a = s.nextInt(); 					 
			b = s.nextInt(); 					
			c = s.nextInt(); 					
			while (true) { 						 
				if (a != b) { 					 
					basket[a-1] = c; 			
					a++; 						  
				}
				if (a == b) 					
				{
					basket[a-1] = c; 			
					break; 						 
				}

			}

		}
		for (int i = 0; i < basket.length; i++) {
			System.out.print(basket[i] + " ");
		}
		
		
	}
}
