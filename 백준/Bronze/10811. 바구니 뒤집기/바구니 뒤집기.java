import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer arr[] = new Integer[s.nextInt()];
		int order = s.nextInt(); 
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1; // 0 = 1, 1 = 2, 2= = 3...
 
		}

		for (int i = 0; i < order; i++) {
			int min = s.nextInt() - 1;
			int max = s.nextInt() - 1;

			while (min < max) {
				temp = arr[min];
				arr[min] = arr[max];
				arr[max] = temp;
				min++;
				max--;

			}

		}
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}

	}

}
