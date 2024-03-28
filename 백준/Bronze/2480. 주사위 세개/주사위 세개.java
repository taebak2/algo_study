import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a == b && a == c) {
			System.out.println(10000 + (a * 1000)); 
		} else if (a == b && a != c) {
			System.out.println(1000 + (a * 100));
		} else if (a == c && b != c) {
			System.out.println(1000 + (a * 100));
		} else if (a != b && b == c) {
			System.out.println(1000 + (b * 100));
		}
		if (a != b && a != c && b != c) {
			if (a > b && a > c) {
				System.out.println(a * 100);
			} else if (b > a && b > c) {
				System.out.println(b * 100);
			} else if (c > a && c > b) {
				System.out.println(c * 100);
			}
		}
	}
}
