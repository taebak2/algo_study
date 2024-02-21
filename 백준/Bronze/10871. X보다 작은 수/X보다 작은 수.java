import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int X = s.nextInt(); 
		int[] n = new int[N];

		for (int i = 0; i < N; i++) {
			n[i] = s.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (X > n[i]) {
			System.out.print(n[i]+ " ");
			}
		}
		s.close();
	}

}
