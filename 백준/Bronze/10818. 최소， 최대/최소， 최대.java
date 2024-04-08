import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[] = new int[n];

		for (int i = 0; i < n; i++) {
			num[i] = s.nextInt(); 
		}

		int min = num[0]; // 초기값을 배열의 첫 번째 요소로 설정
		int max = num[0]; // 초기값을 배열의 첫 번째 요소로 설정

		// 배열을 순회하면서 최소값과 최대값을 찾음
		for (int i = 1; i < n; i++) { 
			if (num[i] < min) {
				min = num[i];
			}
			if (num[i] > max) {
				max = num[i];
			}
		}

		System.out.println(min + " " + max);
	}
}
