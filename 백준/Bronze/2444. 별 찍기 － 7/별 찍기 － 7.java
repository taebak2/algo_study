import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		for (int i = 1; i <= n; i++) {

			for (int j = n; j > i; j--) {  

				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) - 1; j++) {
				System.out.print("*");
			}

			System.out.println("");

		}

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
		


			for (int j = (2*n)-i; j>=i+2; j--) {

				System.out.print("*");
			}
			System.out.println("");
		
		}
	}
}
