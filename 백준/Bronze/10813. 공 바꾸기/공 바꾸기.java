import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 5개의 바구니에 공이 1개씩 들어있음
		// 바구니 번호 = 공 번호 1번 바구니 = 1번 공
		// 공을 M번 바꾸려고함 = > 바꿀 바구니 2개를 선택
		// 두 바구니에 있는 공을 교환
		// 공을 어떻게 바꿀지 주어졌을 때, m번 공을 바꾼 후 어떤 공이 들어있는지 구하세요
		// n 바구니 개수, m 교환 횟수

		Scanner sc = new Scanner(System.in);
		int box = sc.nextInt(); 			// 바구니 갯수
		int change = sc.nextInt(); 			// 교환 횟수
		int arr[] = new int[box]; 			// 바구니 갯수 크기의 배열
		int a = 0; 							// 교환할 바구니
		int b = 0; 							// 교환할 바구니 2
		int temp[] = new int[change]; 
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; 					// 바구니 0 - 공 0 바구니 1 - 공 1 ...
		}
		for (int i = 0; i < change; i++) { 	// 교환 횟수만큼 반복
			a = sc.nextInt(); 				// 바꿀 공 번호 입력
			b = sc.nextInt();	
			temp[i] = arr[a-1]; 
			arr[a-1] = arr[b-1];
			arr[b-1] = temp[i];
		}
		
		  for (int pocket : arr) { System.out.print(pocket+1 + " "); }
		 
	}
}
