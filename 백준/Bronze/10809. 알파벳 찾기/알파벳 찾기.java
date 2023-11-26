import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String word = s.next(); // 단어   
		String place[] = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		for (int i = 0; i < place.length; i++) {
			System.out.print(word.indexOf(place[i]) + " ");
 
		}

	}
}
