import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt(); // 10개의 숫자를 입력해
			arr[i] = arr[i] % 42; // 42로 나눈 나머지값
		}
		arr = Arrays.stream(arr).distinct().toArray();
		
		System.out.println(arr.length);
		
		
	}

}
