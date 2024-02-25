import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		// 시험점수 조작 문제.. ㅋ
		// 1. 배열 선언. 
		// 2. 배열에 넣을 변수 선언 ex) int a = s.nextint;
		// 3. 배열에 a집어넣음
		// 4. for문으로 a번 동안 각각의 숫자를 집어넣음
		// 5. 
		
		
		int a = s.nextInt(); 			// 과목 갯수
		double test[] = new double[a];  // 과목 개수만큼 방을 만듬
		double avg[] = new double[a];   // 배열 나눈값
		double sum = 0;
		for (int i = 0; i < test.length; i++) {
			test[i] = s.nextInt(); 		// 방별로 숫자 넣음
		}
		Arrays.sort(test); 				// 오름차순 정렬
		for (int i = 0; i < test.length; i++) {
			avg[i] = (test[i] / (test[test.length-1])*100); // 평균으로 나는 각각의 점수 
		}
		
		for(double num : avg) {
			sum+= num;
		}
		double value = 0;
		value = sum/a;
		System.out.println(value);
		
	}
}
