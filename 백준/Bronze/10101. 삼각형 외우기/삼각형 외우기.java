import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a == 60 && b == 60 && c == 60) {
			System.out.println("Equilateral");
		} else if (a + b + c == 180 && a == b || b == c | a == c) {
			System.out.println("Isosceles");
		} else if (a + b + c == 180 && a != b && b != c & a != c) {
			System.out.println("Scalene");
		} else if (a + b + c != 180) {
			System.out.println("Error");
		}

	}

}